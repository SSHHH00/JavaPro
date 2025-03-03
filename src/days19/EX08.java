package days19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 4:27:11
 * @subject			java.util패키지
 * @content				ㄴ 자주 사용되는 유용한 유틸리티(클래스)
 */
public class EX08 {

	public static void main(String[] args) {
		//  [ 1 ] java.util.Arrays 클래스
		int [] m = {1,2,3,4,1};
		System.out.println(Arrays.toString(m));
		
//		Arrays.fill(m, -1);
//		System.out.println( Arrays.toString(m));
		Arrays.sort(m); // 오름차순정렬
		//내림차순 정렬
		// int [] m => Integer [] 변환
//		Integer[] n =  new Integer[m.length];
//		for (int i = 0; i < m.length; i++) {
//			n[i] = m[i];
//		} //for
		
//		int [] m => Integer [] 변환
		IntStream is =  Arrays.stream(m);
		Integer[] n = is.boxed().toArray( Integer[]::new);
		
//		Arrays.sort(n, Collections.reverseOrder());
		Arrays.sort(n, (o1,o2) ->(o2.compareTo(o1)));
		System.out.println(Arrays.toString(n));
		
//		Arrays.copyOf(m, m.length +3);
//		Arrays.copyOf(m, int form, int to);
		
		//두 배열이 같은지 여부 체크
//		Arrays.compare(int[], int[]);
		
		//int[] -> List 변환
//		List<int[]> Arrays.asList(m);
		
		
		
		
	}//main

}//class

















