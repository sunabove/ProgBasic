package lec.numeric;

import java.io.PrintStream;

public class NewtonRaphson {
	
	PrintStream out = System.out;
	
	public NewtonRaphson() {
	}
	
	public double f(double x) {
		return x*x - x - 2;
	}
	
	public double f1(double x) {
		return 2*x - 1;
	}
	
	public double solve() {
		var x = 100.0;
		var epsilon = 0.000001;
		
		var idx = 0 ; 
		
		var f = 0.0;
		var f1 = 0.0 ; 
		do {
			f = f(x) ; 
			f1 = f1(x) ;
			
			out.println( String.format( "[%04d] f(%.9f) = %.9f", idx, x, f ) );
			
			x = x - f/f1 ;			
			idx ++ ; 
		} while( Math.abs( f ) > epsilon );
		
		return x;
	}

	public static void main(String[] args) {
		var newtonRaphson = new NewtonRaphson();
		
		var x = newtonRaphson.solve();
		
		System.out.println( String.format("\nsolution = %f", x ) );

	}

}
