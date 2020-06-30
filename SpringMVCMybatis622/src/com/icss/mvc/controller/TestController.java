package com.icss.mvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.icss.mvc.dao.BookDao;
import com.icss.mvc.entity.Book;


@Controller
public class TestController {
	/**
	 * 
	 * @param mp
	 * @return null 默认转发与控制器映射名同名的jsp
	 */
	@RequestMapping(value="test1")	
	public String fun1(ModelMap mp) {
		System.out.println("test1----------------------------------");
		return null;
	}
}
