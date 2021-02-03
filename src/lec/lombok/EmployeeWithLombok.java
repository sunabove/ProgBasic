package lec.lombok;

import java.util.Date;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

//@Getter
//@Setter
//@ToString
@Data
@Slf4j

public class EmployeeWithLombok {
	
	// private static final Logger logger = LoggerFactory.getLogger(EmployeeWithLombok.class);
	
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