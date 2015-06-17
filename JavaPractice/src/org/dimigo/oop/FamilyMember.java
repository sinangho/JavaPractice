/**
 * 
 */
package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ FamilyMember
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class FamilyMember {
	
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember() {}
	public FamilyMember(String memerName) {
		this.memberName = memerName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명\n");
	}

}
