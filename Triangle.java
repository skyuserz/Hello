package 上机作业;

import java.util.*;

class IllegalTriangleException extends Exception {
	
	public IllegalTriangleException () {
		
	}
	public IllegalTriangleException (String s) {
		super (s);
	}
}

public class Triangle{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	public Triangle () {
		
	}
	public Triangle (double side1, double side2, double side3) 
		throws IllegalTriangleException {
		if ((side1+side2 > side3) && (side1+side3 > side2) && (side2+side3 > side1)) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		}
		else {
			throw new IllegalTriangleException ("Any two sides of triangle must be greater than the third one"); 
		}
		
	}
	public double getSide1 () {
		return side1;	
	}
	public double getSide2 () {
		return side2;
	}
	public double getSide3 () {
		return side3;
	}
/*	public double getArea () {
		double s = (double)(side1 + side2 + side3) / 2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public double getPerimeter () {
		return (side1 + side2 + side3);
	}
*/
	public String toString () {
		return "Trianle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		try {
			Triangle t1 = new Triangle (side1, side2, side3);
			System.out.println(t1.toString());
		}
		catch (IllegalTriangleException ex) {
			System.out.println (ex);
		}
		
	}
}

