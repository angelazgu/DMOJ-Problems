package ccc16;

import java.util.Scanner;

public class J4ArrivalTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s[] = sc.next().split(":");
		int h = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
		int t = h*60 + m;
		for (int i = 0; i < 120; i++) {
			if (420 <= t && t < 600) t += 2;
			else if (15*60 <= t && t < 19*60) t +=2;
			else t++;
		}
		h = (t /60)%24; m = t % 60;
		System.out.printf("%02d:%02d\n", h, m);
	}

}
