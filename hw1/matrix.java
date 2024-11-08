package hw1;

import java.util.Arrays;
import java.util.Random;

public class matrix {

	public static void main(String[] args) {
		
		
		int[][] l = createMatrix(3, 4);
		for(int i = 0 ; i< l.length; i++) {
			System.out.println(Arrays.toString(l[i]));
		}
		
		}
		public static int[][] createMatrix(int x, int y) {
			  Random random = new Random();
			  int[][] array = new int[x][y];
			  for (int i = 0; i < x; i++) { 
			   for (int j = 0; j < y; j++) {
			    array[i][j] = random.nextInt(2);
			   }
			  }
			  return array;
			  
			 }
}

	
	