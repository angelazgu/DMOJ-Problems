package ccc18;

import java.util.*;

public class S1VoronoiVillages {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		double[] villages = new double[num];
		
		for (int i = 0; i < num; i++) {
			villages[i] = sc.nextInt();
		}

		Arrays.sort(villages);
		double size = 0;
		double[] sizes = new double[num - 2];
		
		for (int j = 1; j < num - 1; j++) {
			size = ((villages[j] - villages[j-1])/2) + ((villages[j+1] - villages[j])/2);
			
			sizes[j-1] = size;
		}
		Arrays.sort(sizes);
		String answer = String.format("%.1f", sizes[0]);
		
		System.out.println(answer);
	}

}
