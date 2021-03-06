package lec.oo_shape;

public class ShapeTest {

	public static void main(String[] args) { 
		var out = System.out;
		
		out.println( "*".repeat(50) );
		
		Shape [] shapes = { new Triangle( 1, 2 ), new Rectangle( 3, 4 ), new Circle( 5 ) } ; 
		
		for( var shape : shapes ) {
			out.println( "".format( "area=%.2f, perimeter=%.2f", shape.getArea(), shape.getPerimeter())); 
		}
		
		for( var shape : shapes ) { 
			shape.draw();
		}
		
	}

}
