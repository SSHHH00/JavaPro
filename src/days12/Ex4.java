package days12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Ex4 {
    public static void main(String[] args) {
    	/*
    	 [ 정렬 (sort) ]
    	 - 특정 기준에 맞게 데이터를 열거하는 알고리즘
    	 - 오름차순 정렬( [Asc] ending Sort )
    	 - 예 ) 작은 값 ---> 큰값순으로 정렬
    	 	1 2 3 4 5 
    	 	a b c d e
    	 	가나다라마
    	 	
    	 	내림차순정렬 ( [Desc] ending Sort)
    	 	5 4 3 2 1 
    	 	e f c b a
    	 	마라다나가
    	 	
    	 	버블정렬 
    	 	
    	 	
    	 	
    	 	삽입정렬
    	 ㄴ 두 번째 위치로부타 시작해서 왼쪽의 값들과 비교해서
    	 	삽입될 위치를 지정한 후, 뒤로 값을 밀고
    	 	삽입될 위치에 값을 삽입해서 정렬하는 방법.
    	 	
    	 	ㄴ 작은 값을 찾는 검색 과정 필요 X
    	 
    	 
    	 */
    	
    	// 버블정렬
    	int [] m = { 3, 5, 2, 4, 1 };
    	System.out.println(Arrays.toString(m));
    	
    	bublleSort(m);
    	bublleSort2(m);
    	insertionSort(m);
    	
    	
    }

	private static void insertionSort(int[] m) {
		for (int i = 1; i < m.length; i++) {
			int key = m[i];
			int j = i - 1;
			
			while (j >= 0 && m[j] > key) {
				m[j + 1] = m[j];
				j--;
				System.out.println("삽입 정렬 단계"+ i +": "+Arrays.toString(m));
			} //while
		} //for
		
	}

	private static void bublleSort2(int[] m) {
		for (int i = 0, minIndex; i < m.length-1; i++) {
	         minIndex = i;
	         for (int j = i+1; j < m.length; j++) {
	            if (m[minIndex] > m[j] ) {
	               minIndex = j;
	            } // if
	         } // for j
	         if (i != minIndex) {
	            int temp = m[i];
	            m[i] = m[minIndex];
	            m[minIndex] = temp;
	         } 
	      } // for i
		
		
	}

	private static void bublleSort(int[] m) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.printf("(%d,%d)",j,j+1);
				if ( m[j] > m[j+1]) {
					int temp = m[j+1];
					m[j] = m[j+1];
					m[j+1] = temp;
				} //if
				System.out.println(Arrays.toString(m));
			} //for
		} //for
		
		/*
		 * (0,1) (1,2) (2,3) (3,4)		1회전
		 * (0,1) (1,2) (2,3)			2회전
		 * (0,1) (1,2)					3회전
		 * (0,1) 						4회전
		 * 
		 */
		for (int i = 0; i < 4; i++) {  // 행
	         for (int j = i+1; j <= 4; j++) {   
	            System.out.printf("(%d,%d) ", i,  j );
	            if ( m[i] > m[j]) {
	               System.out.print(" *** ");
	               int temp = m[i];
	               m[i] = m[j];
	               m[j] = temp;
	            } // if
	            System.out.println(Arrays.toString(m));
	         } // for j
	         System.out.println();
	      } // for i
		
		
	}
}
