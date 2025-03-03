package days13;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 *					배열 변환 
 */
public class Ex08 {

	public static void main(String[] args) {
		//1차원 배열
		int [] m = {1,2,3,4,5,6,7,8,};
		//2차원 배열
		
		// 1차원 배열 -> 2차원 배열 변환(이동)
		int[][] n = new int[2][4];
		for (int i = 0; i < m.length; i++) {
			n[i/n[0].length][i%n[0].length] = m[i];
		} //for
		
		System.out.println(Arrays.toString(n[0]));
	}

}
