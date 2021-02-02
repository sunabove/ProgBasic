package lec.oo_shape;

public class Rectangle extends Shape {
	
	double width ;
	double height ;
	
	public Rectangle( double width, double height) {
		this.width = width;
		this.height = height; 
	}

	@Override
	public void draw() {
		System.out.println( "\nRectangle" );
		
		String text = """
				*********************************************
				*                                           *
				*                                           *
				*                                           *
				*                                           *
				*                                           *
				*                                           *
				*                                           *
				*********************************************
				""";
		System.out.println( text );
	}

	@Override
	public double getArea() {		
		return width*height;
	}

	@Override
	public double getPerimeter() { 
		return 2*(width +height);
	}

}
