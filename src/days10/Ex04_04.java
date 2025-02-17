package days10;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 4:31:54
 * @subject			Arrays.copyOf() 매서드
 * @content		배열 복사 매서드
 * 				System.arraycopy()
 * 				Arrays.copyOfRange()
 * 				clone() 
 * 				Stream API	
 */
public class Ex04_04 {

	public static void main(String[] args) {
		//배열 --> 더큰 배열 복사

		int [] m = {1,2,3};
		int [] temp =new int[m.length+3];
		// [1]
		
		//[2] System.arraycopy()
//		System.arraycopy(m, 0, temp, 2, m.length+3);
		
		// [3]
//		Arrays.copyOf(m, m.length +3);
		int[] mClone = m.clone(); //복제
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(temp));


	}

}
