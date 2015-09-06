package net.anthonyferrillo.codewar.test;


/**
 * Name: 
 * Number of Rectangles in a Grid
 * 
 * Description:
 * Given a grid of size m x n, calculate the total number of rectangles contained 
 * in this rectangle. 
 * All integer sizes and positions are counted.
 */
public class Rectangles {
		  
	public static int numberOfRectangles(int m, int n) {
		return m*((m+1)*(n)*(n+1))/4;
	}
	
	public static void main(String[] args) {
		System.out.println(Rectangles.numberOfRectangles(4, 6));
	}
}
