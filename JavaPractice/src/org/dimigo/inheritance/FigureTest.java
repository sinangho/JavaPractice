/**
 * 
 */
package org.dimigo.inheritance;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ FigureTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 19.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Figure f = new Figure(0, 0);
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(20, 20, 8, 5);
		Triangle t = new Triangle(10, 10, 4, 10);
		
		System.out.println("원의 넓이 : " + c.calcArea());
		System.out.println("삼각형 넓이 : " + t.calcArea());
		System.out.println("사각형 넓이 : " + r.calcArea());
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		System.out.println();
		
		System.out.println("-- 중심좌표 이동 (x, y축 5씩)");
		System.out.println();
		
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
	}

}
