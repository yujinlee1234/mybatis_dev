package kr.or.dgit.bigdata.mybatis_dev;

import static org.junit.Assert.*;

import java.util.Calendar;

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
}
