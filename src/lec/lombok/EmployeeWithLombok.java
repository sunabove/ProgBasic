package lec.lombok;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter

@ToString

@Slf4j

public class EmployeeWithLombok {
	
	// log ......
	
	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;
	
	public static void main( String [] args ) {
		log.debug( "Hello...." );
		
		EmployeeWithLombok e = new EmployeeWithLombok();
		e.setFirstName( "John" );
		var firstName = e.getFirstName(); 
		
		System.out.println( firstName );
		System.out.println( e.toString() );
		System.out.println( "" + e.toString() );
		System.out.println( "" + e );
		
		log.debug( "I am here!" );
	}
	
}