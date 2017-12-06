package com.pcq.ssm.service;

import java.util.List;

import com.pcq.ssm.dto.Page;
import com.pcq.ssm.entity.Department;
import com.pcq.ssm.entity.Employee;

public interface UserService {
	public void service();
	public Department showDepartment();
	public  Employee insert();
	public Employee login(String id, String birth);
	List<Employee> getEmployees();
	public Page showPage(int current);
	public int remove(int id);
}
