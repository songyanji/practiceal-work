package com.icss.mvc.dao;

import java.util.List;

import com.icss.mvc.entity.Client;

public interface ClientDao {
	public List<Client> findClient();
}
