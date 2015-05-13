/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ Score
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Kor = sc.nextInt();
		int Math = sc.nextInt();
		int Eng = sc.nextInt();
		int T = Kor + Math + Eng;
		
		StringBuilder str = new StringBuilder();
		
		str.append("<< 점수 출력 >>\n");
		str.append("국어 점수 : " + Kor + "점");
		str.append("\n수학 점수 : " + Math + "점");
		str.append("\n영어 점수 : " + Eng + "점");
		str.append("\n총점 : " + T + "점");
		str.append("\n평균 : " + String.format("%.1f", (float)T/3) + "점");
		
		System.out.println(str);
	}

}
