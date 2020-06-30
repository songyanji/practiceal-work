package com.icss.mvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.icss.mvc.dao.ClientDao;
import com.icss.mvc.dao.MybatisUtil;
import com.icss.mvc.dao.StuScoreDao;
import com.icss.mvc.dao.StudentDao;
import com.icss.mvc.entity.Client;
import com.icss.mvc.entity.Score;
import com.icss.mvc.entity.Stu;
import com.icss.mvc.entity.StuScore;
import com.icss.mvc.entity.Student;

@Controller
public class ClientController {
	@RequestMapping("addClientSave")
	public String fun(ModelMap mp,Client client) throws Exception {
		System.out.println("add client save-----------------------------------------");
		System.out.println("add client save---------------------------"+client.getClientId());
		System.out.println("add client save---------------------------"+client.getClientName());
		System.out.println("add client save---------------------------"+2*client.getBucketCnt());
		System.out.println("add client save---------------------------"+2*client.getForegift());
		System.out.println("add client save---------------------------"+client.getStartDate());
		
		return null;
	}
	@RequestMapping("showClient")
	public String fun1(HttpServletResponse response) throws Exception {
		System.out.println("add client save-----------------------------------------");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		ClientDao dao = sqlSession.getMapper(ClientDao.class);
		List<Client> list = dao.findClient();
		Gson gs= new Gson();
		String ss = gs.toJson(list);
		System.out.println(ss);
		out.println(ss);
		out.close();
		return null;
	}
	@RequestMapping(value="showClientJSON",produces="application/json;charset=utf-8")
	@ResponseBody
	public String fun11() throws Exception {
		System.out.println("SHOW client JSON-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		ClientDao dao = sqlSession.getMapper(ClientDao.class);
		List<Client> list = dao.findClient();
		Gson gs= new Gson();
		String ss = gs.toJson(list);
		return ss;
	}
	@RequestMapping(value="showClientJACKSON")
	@ResponseBody
	public List<Client> fun12() throws Exception {
		System.out.println("SHOW client JACKSON-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		ClientDao dao = sqlSession.getMapper(ClientDao.class);
		List<Client> list = dao.findClient();
		return list;
	}
}
