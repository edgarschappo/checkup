package com.checape.core.rest;

import com.checape.core.entity.RoleEntity;
import com.checape.core.repository.RoleRepository;

import javax.ws.rs.Path;

@Path("/role")
public class RoleEntry extends AbstractEntryPoint<Long, RoleEntity, RoleRepository> implements EntryPointInterface
{
}
