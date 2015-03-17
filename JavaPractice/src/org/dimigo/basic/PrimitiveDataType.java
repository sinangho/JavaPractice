package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "아이유";
		boolean zender = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char Blood_Type = 'A';
		
		
		System.out.println("<< 아이유 프로필 >>");
		
		System.out.println("이름 : " + name);
		
		if(!zender)
			System.out.println("성별 : 여자");
		
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("체질량 : " + weight + "kg");
		System.out.println("혈액형 : " + Blood_Type + "형");
		
	}

}
