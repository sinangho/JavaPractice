/**
 * 
 */
package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ Triangle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 18.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Triangle extends Figure{

	private int width;
	private int height;
	
	Triangle (int width, int height) {
		super(0, 0);
		this.height = height;
		this.width = width;
	}

	Triangle (int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.height = height;
		this.width = width;
	}
	
	protected double calcArea() {
		return width*height*0.5;
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
	
	protected void moveFigure(int x, int y) {
		System.out.print("삼각형 ");
		super.moveFigure(x, y);
	}
}
