package _1_AdapterPattern;

import _1_AdapterPattern.adapter.EmployeeAdapterCSV;
import _1_AdapterPattern.adapter.EmployeeAdapterLdap;
import _1_AdapterPattern.employee.Employee;
import _1_AdapterPattern.employee.EmployeeCSV;
import _1_AdapterPattern.employee.EmployeeDB;
import _1_AdapterPattern.employee.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDB);
		
		//Will not work! This is where the adapter comes into play!
		
		//Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		EmployeeAdapterLdap employeeAdapterLdap = new EmployeeAdapterLdap(employeeFromLdap);

		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
		
	}
	
}
