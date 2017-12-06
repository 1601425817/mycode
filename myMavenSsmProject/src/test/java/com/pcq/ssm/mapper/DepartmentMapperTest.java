package com.pcq.ssm.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pcq.ssm.entity.Department;
import com.pcq.ssm.entity.Employee;




public class DepartmentMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession session;
	private DepartmentMapper departmentMapper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Before
	public void before(){
		session = sqlSessionFactory.openSession();
		departmentMapper = session.getMapper(DepartmentMapper.class);
	}
	
	@After
	public void after(){
		session.close();
		
	}

	@Test
	public void test() {
		Department department = departmentMapper.showDepartment(1);
		System.out.println(department);
	}
	


}
