package com.pcq.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcq.ssm.entity.Department;
import com.pcq.ssm.entity.Employee;
import com.pcq.ssm.mapper.EmployeeMapper;
import com.pcq.ssm.service.Impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userService;
//	private int id;
//	private String hobbies[];
	public void doGet()
	{
		System.out.println("this is UserController");
//		for (String string : hobbies) {
//			System.out.println(string);
//		}
//		System.out.println(employee);
		userService.service();
	}
	@RequestMapping(value="/login")
	public String login(String id, String birth, HttpSession session){
		
		try {
			
			Employee employee = userService.login(id, birth);
			
			session.setAttribute("employee", employee);
			System.out.println("12312");
			//request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
			return "index";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	
}
