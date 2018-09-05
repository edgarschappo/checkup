package com.checape.core.setup;

import java.io.InputStream;
import java.util.List;

import javax.inject.Inject;

import org.apache.axis.utils.XMLUtils;
import org.apache.deltaspike.jpa.api.transaction.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.checape.core.entity.StateEntity;
import com.checape.core.service.StateService;

public class StateSetup implements SetupStartInterface
{
	@Inject
	StateService service;

	@Override
	@Transactional
	public void run()
	{
		List<StateEntity> stateList = service.getAll();
		
		//Apenas quando a tabela esta vazia
		if(!stateList.isEmpty())
		{
			return;
		}
		
		try
		{
			InputStream in = this
					.getClass()
					.getClassLoader()
					.getResourceAsStream("/setup/states/BRA-states.xml");
			
			Document doc = XMLUtils.newDocument(in);
			NodeList states = doc.getFirstChild().getChildNodes();

			for (int i = 0; i < states.getLength(); i++)
			{
				if (!(states.item(i) instanceof Element))
					continue;
				
				Element stateElement = (Element) states.item(i);
				String code = stateElement.getAttribute("code");
				String name = stateElement.getAttribute("name");
				
				if(service.findByCode(code) == null)
				{
					StateEntity state = new StateEntity();
					state.setCode(code);
					state.setName(name);	
					
					service.create(state);
				}			
			}
		}
		catch (Exception e)
		{
			return;
		}
		
	}

	@Override
	public int startupSequence()
	{
		return 30;
	}
}
