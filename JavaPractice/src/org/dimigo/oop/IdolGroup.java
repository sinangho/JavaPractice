/**
 * 
 */
package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *      |_ IdolGroup
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 27.
 * </pre>
 * @User            : nangho
 * @author         : 신창호
 * @version         : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] idolGroup = new String[]{ "빅뱅", "2NE1", "걸스데이"};
		String[][] members = new String[][]{
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그 외"}
				};
		
		for(int i=0; i<idolGroup.length; i++){
			System.out.println("<< "+ idolGroup[i] + " 멤버 >>");
			for(int j=0; j<members[i].length; j++){
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}

}
