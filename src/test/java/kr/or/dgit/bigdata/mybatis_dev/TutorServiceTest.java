package kr.or.dgit.bigdata.mybatis_dev;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.Course;
import kr.or.dgit.bigdata.mybatis_dev.dto.Tutor;
import kr.or.dgit.bigdata.mybatis_dev.service.TutorService;

public class TutorServiceTest {
	private static TutorService tutorService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = TutorService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}
	// join
	
	@Test
	public void testfindTutorById() {
		Tutor tutor = tutorService.findTutorById(1);
		Assert.assertNotNull(tutor);
		System.out.println("testfindTutorById()"+tutor);
		List<Course> list = tutor.getCourse();
		for(Course c:list){
			Assert.assertNotNull(c);
			System.out.println(c);
		}
	}

}
