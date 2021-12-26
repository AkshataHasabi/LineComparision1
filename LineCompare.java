package com.bridgelab.linecomparision;

public class LineCompare {

	public static void main(String[] args) {
		int x1, x2, x3, x4, y1, y2, y3, y4;
		x1=2;
		x2=4;
		x3=3;
		x4=10;
		y1=4;
		y2=6;
		y3=5;
		y4=7;
		int value1= (int) Math.sqrt(Math.pow(x2-x1,  2) + Math.pow(y2-y1, 2));
		int value2= (int) Math.sqrt(Math.pow(x4-x3,  2) + Math.pow(y4-y3, 2));
		Integer lineLength1 = new Integer(value1);	
		Integer lineLength2 = new Integer(value2);
		int result =lineLength1.compareTo(lineLength2);
		if(result > 0) {
			System.out.println("Line1 is greater than line2");
		}
		else if(result < 0) {
			System.out.println("Line1 is less than line2");
		}
		else {
			System.out.println("Line1 is equall to line2");
		}
	}
}
