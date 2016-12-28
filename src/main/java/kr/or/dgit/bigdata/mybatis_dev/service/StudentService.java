package kr.or.dgit.bigdata.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.mybatis_dev.dto.Student;
import kr.or.dgit.bigdata.mybatis_dev.mappers.StudentMapper;
import kr.or.dgit.bigdata.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(StudentService.class);
	
	private final static StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}

	private StudentService() {}
	
	public Student findStudentById(int studId){
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(studId);
		}finally{
			sqlSession.close();
		}
	}	
	
}
