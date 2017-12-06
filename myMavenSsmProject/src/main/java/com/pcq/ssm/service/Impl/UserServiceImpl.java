package com.pcq.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pcq.ssm.dto.Page;
import com.pcq.ssm.entity.Department;
import com.pcq.ssm.entity.Employee;
import com.pcq.ssm.mapper.DepartmentMapper;
import com.pcq.ssm.mapper.EmployeeMapper;
import com.pcq.ssm.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	public void service()
	{
		System.out.println("this is UserService");
	}

	@Override
	public Department showDepartment() {
		// TODO Auto-generated method stub
		Department department = departmentMapper.showDepartment(1);
		return department;
	}

	@Override
	public Employee insert() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setName("李琦");
		employee.setAge(20);
		employee.setBirth("1997-7-18");
		employee.setDid(1);
		employeeMapper.insert(employee);
		return employee;
	}
	@Override
	public Employee login(String id, String birth) {
		// TODO Auto-generated method stub
		Employee employee =	employeeMapper.findById(Integer.valueOf(id));
		if( null == employee ){
			throw new RuntimeException("用户名不存在");
		} else if ( ! birth.equals( employee.getBirth() ) ){
			throw new RuntimeException("密码错误");
		}
		
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeMapper.findAll();
	}

	@Override
	public Page showPage(int current) {
		// TODO Auto-generated method stub
		Page page = new Page(current);
		int offset = page.getOffset();
		int size = page.getSize();
		int count = employeeMapper.count();
		page.setTotolRow(count);
		page.setList(employeeMapper.showPage(offset, size));
		return page;
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return employeeMapper.delete(id);
	}
	
	
	
	
}
