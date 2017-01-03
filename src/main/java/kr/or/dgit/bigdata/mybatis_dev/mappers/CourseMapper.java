package kr.or.dgit.bigdata.mybatis_dev.mappers;

import java.util.HashMap;
import java.util.List;

import kr.or.dgit.bigdata.mybatis_dev.dto.Course;

public interface CourseMapper {
	public List<Course> searchCourses(HashMap<String, Object>map);
	public List<Course> searchCaseCourses(HashMap<String, Object> map);
}
