package com.icss.mvc.dao;

import java.sql.Timestamp;
import java.util.List;

import com.icss.mvc.entity.Stu;
import com.icss.mvc.entity.Student;

public interface StudentDao {
	public List<Student> findStuAll();
	public List<Student> findStuByDept(String dept);
	public Student findStuById(String stuId);
	public int addStu(String stuId,String stuName,String sex,Timestamp birthday);
	public int insertStu(Student stu);
	
	public List<Stu> findStuWithScore1();
}
