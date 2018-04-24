/**
 * 
 */
package com.epam.library.dao;

import java.util.List;

import com.epam.library.domain.Entity;

/**
 * @author Артем
 *
 */
public interface BaseDAO<T extends Entity> {

	public void create(T entity);

	public void delete(int id);

	public T read(int id);

	public List<T> readAll();

	public void update(int id, T entity);

}
