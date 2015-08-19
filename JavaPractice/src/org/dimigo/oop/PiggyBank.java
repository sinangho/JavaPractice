/**
 * 
 */
package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ PiggyBank
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class PiggyBank {

	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;	
	}
	
	public static void printBalance() {
		System.out.println("\n돼지저금통 총 금액 : " + balance + "\n");
	}
	
	public static void stealMoney(FamilyMember member, int money) {
		
		if(balance < money) {
			System.err.println("야생의 " + member.getMemberName() + " 이(가) 나타났다!");
			System.out.println(member.getMemberName() + " 은(는) 돈을 훔치는데 실패했다!");
		}
		
		else {
		System.out.println(member.getMemberName() + " 이(가) " + money + "원을 훔치는데 성공했다!");
		balance -= money;
		}
	}
}
