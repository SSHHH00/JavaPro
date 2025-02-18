package days12;

import java.util.Arrays;

public class Ex04_02 {

	public static void main(String[] args) {
		/* [ 병합정렬 (merge sort)
		 *ㄴ1) 이미 정렬되어져 있는 두개의 배열을 합쳐서
		  		하나의 배열로 만드는 정렬 방식
		 
		 */
		
		int [] m = {1,3,6,10,14};
		int [] n = {2,4,7};
		
	//	int [] mn = new int[m.length + n.length];
		
		int [] mn = mergeSort(m,n);
		System.out.println(Arrays.toString(mn));
		
		
	}

	private static int[] mergeSort(int[] m, int[] n) {
		int[] mn = new int[m.length + n.length];

        int i = 0, j = 0, k = 0;

        while (i < m.length && j < n.length) {
            mn[k++] = (m[i] < n[j]) ? m[i++] : n[j++];
        }

        while (i < m.length) mn[k++] = m[i++];
        while (j < n.length) mn[k++] = n[j++];

        return mn;
        
        
	}

}
