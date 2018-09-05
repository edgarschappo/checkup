package com.checape.core.setup;

import java.io.InputStream;
import java.util.List;

import javax.inject.Inject;

import org.apache.axis.utils.XMLUtils;
import org.apache.deltaspike.jpa.api.transaction.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.checape.core.entity.CityEntity;
import com.checape.core.entity.StateEntity;
import com.checape.core.service.CityService;
import com.checape.core.service.StateService;

public class CitySetup implements SetupStartInterface
{
	@Inject
	CityService service;
	
	@Inject
	StateService stateService;

	@Override
	@Transactional
	public void run()
	{
		List<CityEntity> cityList = service.getAll();
		
		//Apenas quando a tabela esta vazia
		if(!cityList.isEmpty())
		{
			return;
		}
		
		try
		{
			InputStream in = this
					.getClass()
					.getClassLoader()
					.getResourceAsStream("/setup/cities/BRA-city.xml");
			
			Document doc = XMLUtils.newDocument(in);
			NodeList cities = doc.getFirstChild().getChildNodes();

			for (int i = 0; i < cities.getLength(); i++)
			{
				if (!(cities.item(i) instanceof Element))
					continue;
				
				Element cityElement = (Element) cities.item(i);
				String stateCode = cityElement.getAttribute("state");
				String name = cityElement.getAttribute("name");
				String code = cityElement.getAttribute("id");				
				
				if(service.findByCode(code) == null)
				{					
					CityEntity city = new CityEntity();
					city.setCode(code);
					city.setName(name);
					
					StateEntity state = stateService.findByCode(stateCode);
					city.setState(state);
					
					service.create(city);
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
