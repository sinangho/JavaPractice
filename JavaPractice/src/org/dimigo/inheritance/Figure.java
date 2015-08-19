/**
 * 
 */
package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ Figure
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 18.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Figure {

	private int centerX;
	private int centerY;
	
	Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0;
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y) {
//		System.out.println("-- 중심좌표 이동 (");
		this.centerX += x;
		this.centerY += y;
		System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
	}
}
