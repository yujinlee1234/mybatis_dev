package kr.or.dgit.bigdata.mybatis_dev;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.Course;
import kr.or.dgit.bigdata.mybatis_dev.dto.Tutor;
import kr.or.dgit.bigdata.mybatis_dev.service.CourseService;
import kr.or.dgit.bigdata.mybatis_dev.service.TutorService;

public class CourseServiceTest {
	private static CourseService courseService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}
	// join
	
	@Test
	public void testsearchCoursesDefault() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		List<Course> list = courseService.searchCourses(map);
		Assert.assertNotNull(list);
	}
	@Test
	public void testsearchCoursesByName() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName","%java%");
		List<Course> list = courseService.searchCourses(map);
		Assert.assertNotNull(list);
	}
	@Test
	public void testsearchCoursesByStartDate() {
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("startDate",cal.getTime());
		List<Course> list = courseService.searchCourses(map);
		Assert.assertNotNull(list);
	}
	@Test
	public void testsearchCoursesByEndDate() {
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		GregorianCalendar cal2 = new GregorianCalendar(2013, 7, 30);
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("startDate",cal.getTime());
		map.put("endDate",cal2.getTime());
		List<Course> list = courseService.searchCourses(map);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void testsearchCaseCoursesDefault() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> list = courseService.searchCaseCourses(map);
		Assert.assertNotNull(list);
	}
	@Test
	public void testsearchCaseCoursesByName() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("searchBy", "CourseName");
		map.put("courseName","%java%");
		List<Course> list = courseService.searchCaseCourses(map);
		Assert.assertNotNull(list);
	}
	@Test
	public void testsearchCaseCoursesByEndDate() {
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		HashMap<String, Object> map = new HashMap<>();
		map.put("searchBy", "EndDate");
		map.put("startDate",cal.getTime());
		List<Course> list = courseService.searchCaseCourses(map);
		Assert.assertNotNull(list);
	}
}
