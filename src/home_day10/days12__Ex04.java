package home_day10;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 *			삽입정렬
 *
 */
public class days12__Ex04 {

	public static void main(String[] args) {
		
		int [] m = { 3, 5, 2, 4, 1 };
		insertionSort(m);
		
	}

	private static void insertionSort(int[] m) {
		int key; // 삽입할 값
	      for (int i = 1, j; i < m.length; i++) {
	         System.out.printf("%d - ", i);
	         key = m[i];
	         for (j = i-1; j >= 0 ; j--) {
	            if(m[j] <= key) break;
	            m[j+1] = m[j];
	         } // for j
	         m[++j] = key;
	         System.out.println(Arrays.toString(m));
	      } // for i
		
	}

}
