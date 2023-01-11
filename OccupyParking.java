package ccc18;

import java.util.*;

public class OccupyParking {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int count = 0;
		
		String d1 = sc.next();
		String d2 = sc.next();
		
		for (int i = 0; i < num; i++) {
			if ((d1.charAt(i) == d2.charAt(i)) && (d1.charAt(i) == 'C')) {
				count++;
			}
		}
		System.out.println(count);

	}

}
