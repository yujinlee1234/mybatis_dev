package kr.or.dgit.bigdata.mybatis_dev.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyBatisSqlSessionTest {
	private static SqlSessionFactory sqlSessionFactory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sqlSessionFactory = MyBatisSqlSessionFactory.getsqlSessionFactory();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sqlSessionFactory = null;
	}

	@Test
	public void testSqlSession() {
		SqlSession session = sqlSessionFactory.openSession();
		Assert.assertNotNull(session);
	}

}
