package lec.collection;

import java.util.Date;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j

public class Employee {

	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;

	public static void main(String[] args) {
		log.debug("Hello....");

		var emps = new EmployeeList();

		Employee e ;
		
		e = new Employee();
		e.setFirstName("John");

		emps.add(e);
		
		e = new Employee();
		e.setFirstName("Brown");

		emps.add(e);

		for (var emp : emps) { 
			System.out.println( "firstName = " + emp.getFirstName() ); 
			System.out.println( "emp = " + emp);

			log.debug("I am here!");
		}

	}

}