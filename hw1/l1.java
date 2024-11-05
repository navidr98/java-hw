package hw1;

import java.util.Arrays;
import java.util.Random;


public class l1 {

	public static void main(String[] args) {
		int[] scores = {100};
		
		char[] grades = new char[scores.length];
		
		getgrades(scores,grades);
		
		for(int i = 0 ; i < scores.length; i++) {
			System.out.print("Student"+ i + "score is" + scores);
		}
	}
		
		public static void getgrades(int[] scores , char[]grades) {
			int best = max(scores);
			
			for (int i = 0; i < scores.length; i++) {
				grades[i] = switch (scores[i])) {
				case > 100: {
					
					yield type;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + );
				}
			}
	}		
	
			
		public static int max(int[] scores) {
			
			return 100;
		}
		 
}

	
	