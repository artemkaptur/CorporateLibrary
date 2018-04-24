/**
 * 
 */
package com.epam.library.dao;

import java.util.List;

import com.epam.library.domain.Book;

/**
 * @author Артем
 *
 */
public interface BookDAO extends BaseDAO<Book> {

	public List<Book> readByTitle(String title);
}
