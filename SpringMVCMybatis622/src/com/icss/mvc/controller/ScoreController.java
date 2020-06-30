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

import com.icss.mvc.dao.MybatisUtil;
import com.icss.mvc.dao.StuScoreDao;
import com.icss.mvc.dao.StudentDao;
import com.icss.mvc.entity.Score;
import com.icss.mvc.entity.Stu;
import com.icss.mvc.entity.StuScore;
import com.icss.mvc.entity.Student;

@Controller
public class ScoreController {
	@RequestMapping("showScore")
	public String fun(ModelMap mp) throws Exception {
		System.out.println("show score-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StuScoreDao dao=sqlSession.getMapper(StuScoreDao.class);
		List<StuScore> slist = dao.findScore();
		mp.addAttribute("scoreList", slist);
		return "scoreShow";
	}
	@RequestMapping("showScoreName")
	public String fun1(ModelMap mp) throws Exception {
		System.out.println("show score name-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StuScoreDao dao=sqlSession.getMapper(StuScoreDao.class);
		
		List<StuScore> slist = dao.findScoreWithName();
		mp.addAttribute("scoreList", slist);
		return "scoreShow";
	}
	@RequestMapping("showStuScore")
	public String fun2(ModelMap mp) throws Exception {
		System.out.println("show stu score1-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StudentDao dao=sqlSession.getMapper(StudentDao.class);
		
		List<Stu> slist = dao.findStuWithScore1();
		
		mp.addAttribute("stuList", slist);
		return "stuShow";
	}
	@RequestMapping("showScoreStu")
	public String fun3(ModelMap mp) throws Exception {
		System.out.println("show score stu-----------------------------------------");
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StuScoreDao dao=sqlSession.getMapper(StuScoreDao.class);
		
		List<Score> slist = dao.findScoreWithStu();
		
		mp.addAttribute("scoreList", slist);
		return "scoreShow";
	}
}
