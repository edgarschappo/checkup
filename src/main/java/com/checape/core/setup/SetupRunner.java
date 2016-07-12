package com.checape.core.setup;

import com.google.common.collect.Lists;
import org.apache.deltaspike.core.api.lifecycle.Initialized;
import org.reflections.Reflections;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.util.*;

@ApplicationScoped
public class SetupRunner
{
	@Inject
	private Instance<SetupInterface> instances;

	private void runSetup(@Observes @Initialized ServletContext ctx) {
		List<SetupInterface> setupList = Lists.newArrayList(instances.iterator());

		Collections.sort(setupList, new Comparator<SetupInterface>()
		{
			@Override
			public int compare(SetupInterface o1, SetupInterface o2)
			{
				//return o1.customInt > o2.customInt ? -1 : (o1.customInt > o2.customInt ) ? 1 : 0;
				return 0;
			}
		});

		for(SetupInterface setup : setupList)
		{
			//setup.run();
		}
	}
}
