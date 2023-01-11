package ccc14;

import java.util.*;

public class S2AssigningPartners {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String a[] = new String [n];
		String b[] = new String [n];

		
		if (n % 2 != 0) {
			System.out.println("bad");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		
		for (int i = 0; i < n; i++) {
			int num = 0;
			String aName = a[i];
			
			for (int j = 0; j < n; j++) {
				String bName = b[j];
				if (aName.contentEquals(bName)) {
					num = j;
				}
			}
			
			if (a[i].equals(b[i])|| b[num].equals(a[i]) == false) {
				System.out.println("bad");
				return;
			}
		}
		System.out.println("good");
		
	}

}
