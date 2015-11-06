/**
 * 
 */
package org.dimigo.thread;

/*
 *
 * <pre>
 * org.dimigo.thread
 *      |_ Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("main Thread start");
		
		Thread a1 = new Runner("강아지");
		Thread a2 = new Runner("고양이");
		
		a1.setPriority(Thread.MAX_PRIORITY);
		a2.setPriority(Thread.MIN_PRIORITY);
		
		a1.start();
		a2.start();
		
		
		System.out.println("main Thread end");
	}

}
