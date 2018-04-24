/**
 * 
 */
package com.epam.library.dao;

import java.util.List;

import com.epam.library.domain.Employee;

/**
 * @author Артем
 *
 */
public interface EmployeeDAO extends BaseDAO<Employee> {

	public List<Employee> readByEmail(String email);
}
