import java.util.Scanner;

public class epidemiology {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		int d = -1;
		int t = 0;
		double x = 0;
		
		while (p >= t) {
			d ++;
		    x = Math.pow(r,d);
		    t += n * x;
		}
		System.out.println(d);
	}

}