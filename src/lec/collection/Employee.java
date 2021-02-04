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
	
	public static void main( String [] args ) {
		log.debug( "Hello...." );
		
		Employee e = new Employee();
		
		e.setFirstName( "John" );
		var firstName = e.getFirstName(); 
		
		System.out.println( firstName );
		System.out.println( e.toString() );
		System.out.println( "" + e.toString() );
		System.out.println( "" + e );
		
		log.debug( "I am here!" );
	}
	
}