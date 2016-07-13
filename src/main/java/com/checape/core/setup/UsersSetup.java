package com.checape.core.setup;

import com.checape.core.entity.UserEntity;
import com.checape.core.repository.UserRepository;
import com.checape.core.service.UserService;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class UsersSetup implements SetupStartInterface
{
	@Inject
	UserService service;

	@Override
	@Transactional
	public void run()
	{
		List<UserEntity> userList = new ArrayList<UserEntity>();
		userList.add(new UserEntity("adm", "Administrador", "adm", "adm@chp.com", null, null, true));

		for(UserEntity user : userList)
		{
			if(service.findByCode(user.getCode()) == null)
				service.create(user);
		}
	}

	@Override
	public int startupSequence()
	{
		return 30;
	}
}
