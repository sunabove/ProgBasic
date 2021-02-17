package lec.numeric;

import java.io.PrintStream;

public class SquareRootBabylonian {
	
	PrintStream out = System.out;
	double num = 0.0;
	
	public SquareRootBabylonian(double num) {
		this.num = num;
	} 
	
	public double solve() {
		var s = this.num;
		var epsilon = 1e-7;
		
		var idx = 0 ; 
		
		var xn = s + 1;
		var xm = s ; 
		while( xn - xm > epsilon ) {
			idx ++ ;
			
			xn = xm;
			xm = (xn + s/xn)/2.0 ; 
			
			out.println( String.format( "[%04d] f(%.12f) = %.12f", idx, xm, xm*xm ) );
		} ;
		
		return xm ;
	}

	public static void main(String[] args) {
		var num = 2.0;
		var newtonRaphson = new SquareRootBabylonian( num );
		
		var x = newtonRaphson.solve();
		
		System.out.println( String.format("\nSquare root of %f = %f", num, x ) );
	}

}
