package ecoo16;

import java.util.*;

public class R1P3RailwaySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int j = 1; j <= 10; j++) {
			int n = sc.nextInt();
			ArrayList<Integer> train = new ArrayList();
			for(int i = 0; i < n; i++) {
				train.add(sc.nextInt());
			}
			int cost = 0;
			for (int i=n-1; i >= 1; i--) {
				int cart = train.indexOf(i), next = train.indexOf(i+1);
				if (cart > next) {
					cost += cart;
					train.remove(cart);
					train.add(0, i);
				}
			}
			System.out.println(cost);
		}
	}

}
