package com.checape.core.setup;

import com.checape.core.entity.RoleEntity;
import com.checape.core.service.RoleService;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class RolesSetup implements SetupStartInterface
{
	@Inject
	RoleService service;

	@Override
	@Transactional
	public void run()
	{
		List<RoleEntity> roleList = new ArrayList<RoleEntity>();
		roleList.add(new RoleEntity("admim", "Administrador"));
		roleList.add(new RoleEntity("user", "Usuário"));
		roleList.add(new RoleEntity("guest", "Convidado"));

		for(RoleEntity role : roleList)
		{
			if(service.findByCode(role.getCode()) == null)
				service.create(role);
		}
	}

	@Override
	public int startupSequence()
	{
		return 20;
	}
}
