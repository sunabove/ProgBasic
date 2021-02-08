package lec.numeric;

import java.io.PrintStream;

public class SquareRoot {
	
	PrintStream out = System.out;
	double num = 0.0;
	
	public SquareRoot(double num) {
		this.num = num;
	}
	
	public double f(double x) {
		return x*x - num ;
	}
	
	public double f1(double x) {
		return 2*x;
	}
	
	public double solve() {
		var x = 100.0;
		var epsilon = 1e-9;
		
		var idx = 0 ; 
		
		var f = 0.0;
		var f1 = 0.0 ; 
		do {
			idx ++ ; 
			
			f = f(x) ; 
			f1 = f1(x) ;
			
			out.println( String.format( "[%04d] f(%.6f) = %.6f", idx, x, f ) );
			
			x = x - f/f1 ;			
		} while( Math.abs( f ) > epsilon );
		
		return x;
	}

	public static void main(String[] args) {
		var num = 2.0;
		var newtonRaphson = new SquareRoot( num );
		
		var x = newtonRaphson.solve();
		
		System.out.println( String.format("\nSquare root of %f = %f", num, x ) );

	}

}
