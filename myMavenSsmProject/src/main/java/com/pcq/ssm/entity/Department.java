package com.pcq.ssm.entity;

import java.util.List;

public class Department {
	private int did;
	private String name;
	private String manager;
	private List<Employee> employees;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", manager=" + manager + ", employees=" + employees + "]";
	}
	
}
