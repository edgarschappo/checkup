package com.checape.core.service;

import com.checape.core.entity.UserEntity;
import com.checape.core.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;

public class UserService extends AbstractService<Long, UserEntity, UserRepository> implements ServiceInterface<UserEntity, Long>
{
}
