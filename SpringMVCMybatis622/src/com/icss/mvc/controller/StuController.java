package com.icss.mvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.mvc.dao.StuScoreDao;
import com.icss.mvc.dao.StudentDao;
import com.icss.mvc.entity.StuScore;
import com.icss.mvc.entity.Student;

@Controller
public class StuController {
	@RequestMapping("showStu")
	public String fun(ModelMap mp) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		List<Student> slist = dao.findStuAll();
		mp.addAttribute("stuList", slist);
		return "stuShow";
	}
	@RequestMapping("showStuDept")
	public String fun1(ModelMap mp, String dept) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		List<Student> slist = dao.findStuByDept(dept);
		mp.addAttribute("stuList", slist);
		mp.addAttribute("dept", dept);
		return "stuShow";
	}
	@RequestMapping("showStuId")
	public String fun2(ModelMap mp, String stuId ) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		Student stu = dao.findStuById(stuId);
		mp.addAttribute("student", stu);
		return "stuEdit";
	}
	@RequestMapping("addStudent")
	public String fun3(ModelMap mp, String stuId, String stuName, String sex ) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		Timestamp birthday=new Timestamp(System.currentTimeMillis());
		int r = dao.addStu(stuId, stuName, sex, birthday);
		sqlSession.commit();
		mp.addAttribute("stuName",stuName );
		return "show";
	}
	@RequestMapping("addStudent1")
	public String fun31(ModelMap mp, Student stu ) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		stu.setBirthday(new Timestamp(System.currentTimeMillis()));
		int r = dao.insertStu(stu);
		sqlSession.commit();
		mp.addAttribute("student",stu);
		return "stuEdit";
	}
	@RequestMapping("addScore")
	public String fun4(ModelMap mp, StuScore score) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StuScoreDao dao=sqlSession.getMapper(StuScoreDao.class);
		int r = dao.insertStuScore(score);
		sqlSession.commit();
		mp.addAttribute("stuScore",score);
		return "showScore";
	}
	@RequestMapping("addScoreId")
	public String fun41(ModelMap mp, StuScore score) throws Exception {
		System.out.println("show stu-----------------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StuScoreDao dao=sqlSession.getMapper(StuScoreDao.class);
		int r = dao.insertStuScoreGetId(score);
		sqlSession.commit();
		mp.addAttribute("stuScore",score);
		return "showScore";
	}
}
