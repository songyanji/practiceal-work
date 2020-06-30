package com.icss.mvc.entity;

import java.sql.Timestamp;
import java.util.List;

public class Stu {
	private String stuId;
	private String stuName;
	private String sex;
	private Timestamp birthday;
	private String tel;
	private String dept;
	private Integer grade;
	private List<StuScore> scoreList;

	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public List<StuScore> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<StuScore> scoreList) {
		this.scoreList = scoreList;
	}

}
