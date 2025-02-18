package home_day10;

import java.util.Arrays;

public class days12_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static void bubbleSort(int[] m) {
	      /*      0 1 2 3 4  index
	       *       3 5 2 4 1  value
	       * 
	       * (0,1) (1,2) (2,3) (3,4)   1회전  0    4
	       * (0,1) (1,2) (2,3)         2회전  1    3
	       * (0,1) (1,2)               3회전  2    2
	       * (0,1)                     4회전  3    1
	       */
	      for (int i = 0; i < 4; i++) { // 행
	         for (int j = 0; j < 4-i; j++) { // 열 
	            System.out.printf("(%d,%d)", j, j+1);
	            if ( m[j] > m[j+1]) {
	               System.out.print(" *** ");
	               int temp = m[j];
	               m[j] = m[j+1];
	               m[j+1] = temp;
	            } // if
	            System.out.println(Arrays.toString(m));
	         } // for j
	         System.out.println();
	         
	      } // for i
	      
	   }
}
