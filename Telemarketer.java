package ccc18;

import java.util.*;

public class Telemarketer {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		
		if ((d1 == 8 || d1 == 9) && (d2 == d3) && (d4 == 8 || d4 == 9)) {
			System.out.println("ignore");
		}
		else {
			System.out.println("answer");
		}

	}

}
