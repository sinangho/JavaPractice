package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int ten;
		
		for(ten=0; ten<10; ten++){
			for(int i=0; i<10; i++){
				if( i == ten )
					System.out.print("*");
				else{
				System.out.print(arr[i]);
				}
			}
			System.out.println();
		}
	}

}
