package com.icss.mvc.dao;

import java.util.List;

import com.icss.mvc.entity.Book;

public interface BookDao {
	public List<Book> findBookAll();
}
