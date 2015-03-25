package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double S1 = (9+10)*5.8/2;
		double S2 = 9*5.4;
		
		String a = "사다리꼴";
		String b = "평행사변형";
		
		System.out.println("<< 도형 넓이 비교>>");
		System.out.println(a+" 넓이 : "+S1);
		System.out.println(b+" 넓이 : "+S2);
	
		if( S1 > S2) 
			System.out.println(a+"이 "+b+" 보다 "+(S1-S2)+" 더 큽니다.");
		else if( S1 < S2 )
			System.out.println(b+"이 "+a+" 보다 "+(S2-S1)+" 더 큽니다.");
		else {
			System.out.println(a+"과 "+b+"의 넓이가 같습니다.");
		}
	}

}
