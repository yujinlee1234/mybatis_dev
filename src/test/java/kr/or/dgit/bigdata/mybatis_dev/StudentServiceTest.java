package kr.or.dgit.bigdata.mybatis_dev;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.bigdata.mybatis_dev.dto.Student;
import kr.or.dgit.bigdata.mybatis_dev.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = studentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testfindStudentById() {
		Student student = studentService.findStudentById(1);
		Assert.assertNotNull(student);
	}
	@Test
	public void testfindAllStudent() {
		List<Student> student = studentService.findAllStudent();
		Assert.assertNotNull(student);
	}
	/*
	@Test
	public void testInsertStudent() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(1980, 0, 1);
		Student insStd = new Student();
		insStd.setStudId(4);
		insStd.setName("박경아");
		insStd.setEmail("pka@test.co.kr");
		insStd.setPhone(new PhoneNumber("010-1111-2222"));
		insStd.setDob(cal.getTime());
		
		int student = studentService.insertStudent(insStd);
		Assert.assertEquals(1, student);
	}
	
	@Test
	public void testInsertStudentAutoInc() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(1980, 0, 1);
		Student insStd = new Student();
		insStd.setName("박경아2");
		insStd.setEmail("pka@test.co.kr");
		insStd.setPhone(new PhoneNumber("010-1111-2222"));
		insStd.setDob(cal.getTime());
		
		int student = studentService.insertStudentAutoInc(insStd);
		Assert.assertEquals(1, student);
	}
	
	@Test
	public void testUpdateStudent() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(1999,7,07);
		Student insStd = studentService.findStudentById(7);
		insStd.setName("박경아5");
		insStd.setEmail("pka@test.co.kr");
		insStd.setPhone(new PhoneNumber("010-2222-3333"));
		insStd.setDob(cal.getTime());
		
		int student = studentService.updateStudent(insStd);
		Assert.assertEquals(1, student);
	}
	*//*
	@Test
	public void testDeleteStudent() {
		Student insStd = studentService.findStudentById(6);
		
		int student = studentService.deleteStudent(insStd.getStudId());
		Assert.assertEquals(1, student);
	}
	*/
	@Test
	public void testfindStudentByIdForMap() {
		Map<String, Object> stdmap = studentService.findStudentByIdForMap(1);
		Assert.assertNotNull(stdmap);
		
		for(Entry<String, Object> e : stdmap.entrySet()){
			System.out.printf("%s -> %s %n",e.getKey(), e.getValue());
		}
	}
	@Test
	public void testfindAllStudentForMap(){
		List<Map<String, Object>> stdmaplist = studentService.findAllStudentForMap();
		Assert.assertNotNull(stdmaplist);
		
		for(Map<String, Object> m : stdmaplist){
			for(Entry<String, Object> e : m.entrySet()){
				System.out.printf("%s -> %s %n",e.getKey(), e.getValue());
			}
		}
	}
}
