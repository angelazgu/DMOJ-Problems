import java.util.Scanner;

public class voteCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numVotes = sc.nextInt();
		
		int singer1 = 0;
		int singer2 = 0;
		
		for(int x = 0; x != (numVotes + 1); x++) {
			String vote = sc.nextLine();

			if (vote.equals("A")) {
				singer1++;
			}
			
			else if (vote.equals("B")) {
				singer2++;
			}
		}
		
		if (singer1 > singer2) {
			System.out.println("A");
		}

		else if (singer2 > singer1) {
			System.out.println("B");
		}

		else {
			System.out.println("Tie");
		}

	}

}
