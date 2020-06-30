package com.icss.mvc.dao;

import java.util.List;

import com.icss.mvc.entity.Score;
import com.icss.mvc.entity.StuScore;

public interface StuScoreDao {
	public int insertStuScore(StuScore score);
	public int insertStuScoreGetId(StuScore score);
	public List<StuScore> findScore();
	public List<StuScore> findScoreWithName();
	public List<Score> findScoreWithStu();
}
