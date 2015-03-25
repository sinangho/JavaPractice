package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dis = 10;
		int CarType = 3; // 고속버스:1 경차:2 그 외:3
		int Total_fee = 0;
		int fee = ((dis-1) / 10);		
		String Car = "";
		
		if(CarType == 1){
			Total_fee = fee*300 + 850;
			Car = "고속버스";
		}
		else if(CarType == 2){
			Total_fee = fee*200 + 300;
			Car = "경차";
		}
		else if(CarType == 3){
			Total_fee = fee*200 + 600;
			Car = "그 외";
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : "+dis+"km");
		System.out.println("차종 : "+Car);
		System.out.println("통행료 : "+Total_fee+"원");
		
			
	}

}
