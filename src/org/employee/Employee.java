package org.employee;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee extends Project {
	public void empname(String name) {
		System.out.println("employee name is"+name);
	}
	public Employee() {
		System.out.println("employee id is");
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.clientName();
		Company c1=new Company();
		c1.companyName();
		Project p=new Project();
		p.projectName();
		Employee e=new Employee();
		e.empname("kumar");
		
	}

}
