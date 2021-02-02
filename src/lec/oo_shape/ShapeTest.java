package lec.oo_shape;

public class ShapeTest {

	public static void main(String[] args) { 
		var out = System.out;
		
		Shape [] shapes = { new Triangle( 1, 2 ), new Rectangle( 3, 4 ), new Circle( 5 ) } ; 
		
		for( Shape shape : shapes ) {
			out.println( "".format( "area=%.2f, perimeter=0.2f", shape.getArea(), shape.getPeimeter()));
			shape.draw();
		}
		
	}

}
