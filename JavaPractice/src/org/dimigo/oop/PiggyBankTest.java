/**
 * 
 */
package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ PiggyBankTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember i = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(i, 2000);
		PiggyBank.putMoney(brother, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(i, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.stealMoney(brother, 20000);
		
		PiggyBank.printBalance();
	}

}
