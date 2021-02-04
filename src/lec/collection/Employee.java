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

		var empList = new EmployeeList();

		Employee e ;
		
		e = new Employee();
		e.setFirstName("John");

		empList.add(e);
		
		e = new Employee();
		e.setFirstName("Brown");

		empList.add(e);
		
		System.out.println( "#".repeat( 40 ) );
		
		for (var emp : empList) { 
			System.out.println( "firstName = " + emp.getFirstName() ); 
			System.out.println( "emp = " + emp);

			log.debug("I am here!");
		} 
		
		System.out.println( "#".repeat( 40 ) );

		var empList2 = new EmployeeList( empList );
		
		for (var emp : empList2 ) { 
			System.out.println( "firstName = " + emp.getFirstName() ); 
			System.out.println( "emp 2 = " + emp);

			log.debug("I am here!");
		}
		
		

	}

}