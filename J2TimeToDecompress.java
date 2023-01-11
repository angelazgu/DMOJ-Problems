package ccc19;

import java.util.Scanner;

public class J2TimeToDecompress {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int l = sc.nextInt();
		
		for (int i = 0; i < l; i++) {
			String m = sc.nextLine();
			
			String n = m.replaceAll("[^0-9]", "");
			int num = Integer.parseInt(n);
			
			for (int j = 0; j < num; j++) {
				System.out.print(m.length());
			}
			
		}
		
	}

}
