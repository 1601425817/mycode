package com.pcq.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pcq.ssm.dto.Page;
import com.pcq.ssm.entity.Department;
import com.pcq.ssm.entity.Employee;
import com.pcq.ssm.mapper.EmployeeMapper;
import com.pcq.ssm.service.Impl.UserServiceImpl;

@Controller
public class HomeController {
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(@RequestParam(name="current", defaultValue="1") int current, Model model){
		System.out.println(current);
		Page page = userService.showPage(current);
		model.addAttribute("page",page);
		return "index";
	}
	
	@RequestMapping(value="remove/{page}/{id}", method=RequestMethod.GET)
	public String remove(@PathVariable(name="page") int page,@PathVariable(name="id") int id)
	{
		userService.remove(id);
		return "redirect:/?current=" + page;
	}
	

	
}
