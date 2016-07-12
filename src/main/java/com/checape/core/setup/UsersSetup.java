package com.checape.core.setup;

import com.checape.core.repository.UserRepository;
import com.checape.core.setup.annotation.Setup;

import javax.inject.Inject;

@Setup(sequence = 20)
public class UsersSetup implements SetupStartInterface
{
	@Inject
	UserRepository repository;

	@Override
	public void run()
	{

	}
}
