package com.checape.core.service;

import com.checape.core.entity.AbstractEntity;

import java.io.Serializable;
import java.util.List;

public interface ServiceInterface <E extends AbstractEntity<I>, I extends Serializable>
{
	public E getById(I id);

	public List<E> getAll();

	public E create(E entity);

	public E update(E entity);

	public void delete(E entity);
}
