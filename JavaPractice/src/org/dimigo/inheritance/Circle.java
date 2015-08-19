/**
 * 
 */
package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ CIrcle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 18.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Circle extends Figure {
	
	
	private int radius;
	

	Circle (int radius) {
		super(0, 0);
		this.radius = radius;
	}
	
	Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}

	protected double calcArea() {
		return radius*radius*Math.PI;
	}
	
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}
