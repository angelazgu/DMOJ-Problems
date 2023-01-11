package ccc19;

import java.util.*;

public class J1WinningScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a3 = sc.nextInt();
		int a2 = sc.nextInt();
		int a1 = sc.nextInt();
		int b3 = sc.nextInt();
		int b2 = sc.nextInt();
		int b1 = sc.nextInt();
		
		int aTotal = a3*3 + a2*2 + a1;
		int bTotal = b3*3 + b2*2 + b1;
		
		if (aTotal > bTotal) {
			System.out.println("A");
		}
		else if (bTotal > aTotal) {
			System.out.println("B");
		}
		else {
			System.out.println("T");
		}
		
		


		
	}

}
