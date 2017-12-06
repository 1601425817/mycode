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
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pcq.ssm.entity.Employee;



public class EmployeeMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession session;
	private EmployeeMapper employeeMapper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Before
	public void before(){
		session = sqlSessionFactory.openSession(true);
		employeeMapper = session.getMapper(EmployeeMapper.class);
	}
	
	@After
	public void after(){
		session.close();
		
	}

	@Test
	public void test() {
		Employee employee = employeeMapper.findById(1);
		System.out.println(employee);
	}
	
	@Test
	public void testFindAll() {
		List<Employee> employees =  employeeMapper.findAll();
		System.out.println(employees);
	}
	
	@Test
	public void testGetEmployees() {
		List<Employee> employees =  employeeMapper.getEmployees(1);
		System.out.println(employees);
	}
	
	@Test
	public void testInsert() {
		Employee employee = new Employee();
		employee.setEid(9);
		employee.setName("李琦");
		employee.setAge(20);
		employee.setBirth("1997-7-18");
		employee.setDid(1);
		employeeMapper.insert(employee);
	}
	
	@Test
	public void testDelete() {
		int row = employeeMapper.delete(5);
	}

	@Test 
	public void testUpdate() {
		Employee employee = new Employee();
		employee.setName("张三");
		employee.setEid(5);
		int count = employeeMapper.update(employee);
		Assert.assertEquals(1, count);
	}
}
