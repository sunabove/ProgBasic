package lec.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		var cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		cars.set(0, "Opel");
		//cars.remove(0);
		
		Collections.sort(cars); // Sort cars
		
		for (var car : cars) {
			System.out.println( car );
		}
	}
}