package com.bridgelab.linecomparision;

public class LineCompare {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		double length;
		x1=2;
		x2=4;
		y1=4;
		y2=6;
		length=Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2));
		System.out.println(length);
	}
}
