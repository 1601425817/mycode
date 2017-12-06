package com.pcq.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pcq.ssm.entity.Employee;

public interface EmployeeMapper {
	Employee findById(int id);
	
	List<Employee> findAll();
	
	List<Employee> getEmployees(int id);
	
	int insert(Employee employee);
	
	int delete(int id);
	
	int update(Employee employee);
	
	List<Employee> showPage(@Param("offset")int offset,@Param("size") int size);
	
	int count();
}
