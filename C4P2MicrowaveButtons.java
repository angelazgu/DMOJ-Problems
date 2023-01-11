package tle17;

import java.util.*;

public class C4P2MicrowaveButtons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.next().split(":");
		int hour = Integer.parseInt(s[0]);
		int minute = Integer.parseInt(s[1]);
		int second = Integer.parseInt(s[2]);
		int desire = hour*3600 +minute*60 + second;
		String button = sc.next(); boolean work[] = new boolean[10];
		for (int i = 0; i < button.length(); i++) {
			work[button.charAt(i) - '0']= true;
		}
		int dif = Integer.MAX_VALUE, hh = 0, mm = 0, ss = 0;
		for (int h = 0; h <= 99; h++) {
			if(!work[h/10] || !work[h%10]) continue;
			for (int m = 0; m <= 99; m++) {
				if (!work[m/10] || !work[m%10]) continue;
				for (int sec = 0; sec <= 99; sec++) {
					if (!work[sec/10] || !work[sec%10])continue;
					int time = h*3600 + m*60 + sec;
					if(Math.abs(desire-time) < dif) {
						dif = Math.abs(desire - time);
						hh = h;
						mm = m;
						ss = sec;
					}
				}
			}
		}
		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
	}

}
