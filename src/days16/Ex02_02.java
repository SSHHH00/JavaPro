package days16;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 10:21:54
 * @subject	문자열을 내림차순으로 정렬하는 코드
 * @content	Arrays.sort()와 Comparator 활용
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String n = "String";

		// [1] 문자열을 문자 배열로 변환
		char[] nArr = n.toCharArray();

		// [2] 문자 배열을 정렬 (오름차순 정렬)
		Arrays.sort(nArr);

		// [3] 내림차순으로 변경
		for (int i = 0; i < nArr.length / 2; i++) {
			char temp = nArr[i];
			nArr[i] = nArr[nArr.length - 1 - i];
			nArr[nArr.length - 1 - i] = temp;
		}

		// [4] 정렬된 문자 배열을 다시 문자열로 변환
		String sortedString = new String(nArr);

		// 결과 출력
		System.out.println("내림차순 정렬된 문자열: " + sortedString);
	}
}
