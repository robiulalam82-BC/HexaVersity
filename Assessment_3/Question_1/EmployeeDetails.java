package com.employeedetails;

import com.employeedetails.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeDetails {
	public static void main(String[] args) {
		// generating employee list
		List<Employee> employeeList = new ArrayList<Employee>();

		// adding employees in the employee list
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR",
				2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male",
				"Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male",
				"Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male",
				"Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR",
				2013, 22700.0));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female",
				"Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male",
				"Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female",
				"Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj", 31, "Male",
				"Product Development", 2012, 35700.0));

		// assigning employees department wise
		Map<String, List<Employee>> departmentEmployees = new HashMap<String, List<Employee>>();
		List<Employee> empList = null;
		for (Employee employee : employeeList) {
			if (departmentEmployees.get(employee.getDepartment()) == null) {
				departmentEmployees.put(employee.getDepartment(),
						new ArrayList<Employee>());
			}
			empList = departmentEmployees.get(employee.getDepartment());
			empList.add(employee);
			departmentEmployees.put(employee.getDepartment(), empList);
		}

		// Displaying Count of employees in each department
		System.out.println("Employee Count based on department");
		System.out.println("----------------------------------------------------------");
		for (Entry<String, List<Employee>> entry : departmentEmployees.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().size());
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println(" Names of all employees in each department");
		System.out.println("----------------------------------------------------------");
		for (Entry<String, List<Employee>> entry : departmentEmployees.entrySet()) {
			System.out.println("Department : " + entry.getKey());
			for (Employee employee : entry.getValue()) {				
				System.out.println(employee.getName());
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");

	}
}
