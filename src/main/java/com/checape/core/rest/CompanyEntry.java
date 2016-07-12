package com.checape.core.rest;

import com.checape.core.entity.CompanyEntity;
import com.checape.core.repository.CompanyRepository;

import javax.ws.rs.Path;

@Path("/company")
public class CompanyEntry extends AbstractEntryPoint<Long, CompanyEntity, CompanyRepository> implements EntryPointInterface
{
}
