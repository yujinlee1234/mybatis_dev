package kr.or.dgit.bigdata.mybatis_dev.dao;

import kr.or.dgit.bigdata.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentById(int id);
	int insertStudent(Student item);
}
