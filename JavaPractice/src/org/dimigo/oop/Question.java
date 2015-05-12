/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 단단한 헤비전차는?");
		answer = sc.nextLine();
		
		if(answer.equals("마우스"))
			System.out.println("정답");
		else{
			System.out.println("땡");
		}
		
		System.out.println();
		System.out.println("메딕의 생산 가격은?");
		answer = sc.nextLine();
		
		if(answer.equals("미네랄 75원 가스 25원"))
			System.out.println("정답");
		else{
			System.out.println("땡");
		}
		
		System.out.println();
		System.out.println("10만 볼트의 공격 타입과 위력은?");
		answer = sc.nextLine();
		
		if(answer.equals("특수공격 95"))
			System.out.println("정답");
		else{
			System.out.println("땡");
		
		}
		
		sc.close();
	}
}