package kr.or.dgit.bigdata.mybatis_dev.mappers;

import java.util.List;
import java.util.Map;

import kr.or.dgit.bigdata.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentById(int id);
	List<Student> findAllStudent();
	
	Map<String, Object> findStudentByIdForMap(int id);// Student 객체의 field 명이 key 값, 실제값이 object
	List<Map<String, Object>> findAllStudentForMap();
	
	int insertStudent(Student student);
	int insertStudentAutoInc(Student student);
	int updateStudent(Student student);
	int deleteStudent(int idx);
	
	/// join
	
	Student selectStudentWithAddress(int id);
	
}
