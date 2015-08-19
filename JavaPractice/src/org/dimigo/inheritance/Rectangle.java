/**
 * 
 */
package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ Rectangle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 18.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Rectangle extends Figure {
	
	private int width;
	private int height;
	
	Rectangle (int width, int height) {
		super(0, 0);
		this.height = height;
		this.width = width;
	}

	Rectangle (int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.height = height;
		this.width = width;
	}
	
	protected double calcArea() {
		return width*height;
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}
}
