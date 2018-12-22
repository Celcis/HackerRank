package baykara.com;

import java.util.Random;
import java.util.Scanner;

public class Hourglass {


	
	public static void main(String[] args) {
		
	
		Random ran = new Random();
		int[][] arr = new int[6][6];
		
		int sum =0;
		int[] results = new int[16];
		int k =0;
		String t ="";
		
		int max =Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = ran.nextInt(5);
				System.out.print(arr[i][j]+" ");
			
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                sum = arr[i+0][j+0] + arr[i+0][j + 1] + arr[i][j + 2]
                		+ arr[i + 1][j + 1] + 
                		arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                 
                results[k++] = sum;
                }
            }
        }

		for (int i : results) {
			if(i > max) max =i;
		}
        System.out.println(max);
    }
		
		
		
}

	
		
	

