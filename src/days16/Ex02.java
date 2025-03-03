package days16;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 10:03:43
 * @subject
 * @content		(암기) 두문자열을 비교할때는 ==연산자 x , equals(),equalsIgnore();
 */
public class Ex02 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";   


		//	 2.대문자로 변화
		System.out.println(n.toUpperCase());	//대문자로 정렬
		//	 1.문자열 오름차순 정렬
		char [] nArr = n.toCharArray();
		System.out.println(Arrays.toString(nArr));
		Arrays.sort(nArr);		
		
		System.out.println(Arrays.toString(nArr));
		char [] mArr = m.toCharArray();
		Arrays.sort(mArr);
		System.out.println(Arrays.toString(mArr));
		
		n= String.valueOf(nArr);
		m= String.valueOf(mArr);
		System.out.println(n.equals(m));


		//	 3.같은 문자열 비교
	}

}
