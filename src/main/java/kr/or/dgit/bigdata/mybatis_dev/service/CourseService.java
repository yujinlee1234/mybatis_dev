package kr.or.dgit.bigdata.mybatis_dev.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.mybatis_dev.dto.Course;
import kr.or.dgit.bigdata.mybatis_dev.mappers.CourseMapper;
import kr.or.dgit.bigdata.mybatis_dev.mappers.TutorMapper;
import kr.or.dgit.bigdata.mybatis_dev.util.MyBatisSqlSessionFactory;

public class CourseService {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(CourseService.class);
	
	private final static CourseService instance = new CourseService();

	public static CourseService getInstance() {
		return instance;
	}

	private CourseService() {}
	 
	public List<Course> searchCourses(HashMap<String, Object>map){
		
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchCourses(map);
		}finally{
			sqlSession.close();
		}
	}
	
	public List<Course> searchCaseCourses(HashMap<String, Object>map){
		
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchCaseCourses(map);
		}finally{
			sqlSession.close();
		}
	}
	
}
