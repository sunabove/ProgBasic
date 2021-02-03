package lec.lombok;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmployeeWithLombok {
	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;
	
	public static void main( String [] args ) {
		EmployeeWithLombok e = new EmployeeWithLombok();
		var firstName = e.getFirstName(); 
	}
}