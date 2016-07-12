package com.checape.core.rest;

import com.checape.core.entity.UserEntity;
import com.checape.core.repository.UserRepository;
import com.checape.core.service.UserService;

import javax.ws.rs.Path;

@Path("/user")
public class UserEntry extends AbstractEntryPoint<Long, UserEntity, UserRepository> implements EntryPointInterface
{
}
