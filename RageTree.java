package solved;

import java.util.*;

public class RageTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		int min1 = Math.min(num1, num2);
		int min2 = Math.min(num3, num4);
		
		int min = Math.min(min1, min2);
		
		int max1 = Math.max(num1, num2);
		int max2 = Math.max(num3, num4);
		
		int max = Math.max(max1, max2);
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
