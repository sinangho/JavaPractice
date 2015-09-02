/**
 * 
 */
package org.dimigo.abstractclass;

/*
 *
 * <pre>
 * org.dimigo.inheritance
 *      |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone phone[] = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(int i=0; i<phone.length; i++) {
			System.out.println(phone[i].toString());
			phone[i].turnOn();
			phone[i].pay();
			phone[i].useSpecial();
			phone[i].turnOff();
			System.out.println();
		}
		
		

	}

}
