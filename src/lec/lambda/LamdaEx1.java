package lec.lambda;

import java.util.ArrayList;

public class LamdaEx1 {
    public static void main(String[] args) {
    	//var line = "*******************************************************************";
    	var line = "*".repeat( 40 );    	
    	
    	var out = System.out;
    	
        var numbers = new ArrayList<Integer>();
        
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        
        out.println( line );
        out.println( "lambda expression" );

        numbers.forEach((n) -> {
            out.println(n);
        });
        
        out.println( line );
        out.println( "for : " );
        
        for( var n : numbers ) {
        	out.println(n);
        }
        
        out.println( line );
        out.println( "for i" );
        
        for(int i = 0 ; i < numbers.size() ; i++ ) {
        	out.println(numbers.get(i));
        }
    }
}