package days05;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오전 9:23:12
 * @subject		배열 요소, 초기화
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//배열선언	+	각 요소 초기화 = 배열초기화
		
		//배열선언
//		int [] kors = new int [3];
		
		//각 요소를 초기화 
//		kors[0] =89;
//		kors[1] =34;
//		kors[2] =66;
//		
		
//		int [] kors = new int[] {88, 34, 66};				//배욜 초기화
		int [] kors =  {89, 34, 66};
		
		//Arrays 클래스
		
		Arrays.toString(kors);
		System.out.println(Arrays.toString(kors));		//배열에 무엇이 들어잇는지 확인하기 위한 용도
//		
//		
		
		
		
		
		//국어 점수를 3명 저장할 배열을 선언하고 각각  89, 34,66 입력 후 출력하는 코딩을하세요.
		//int kors [] = new int;
		//[암기] 배열을 초기화 하지 아ㅏㄶ으면 그 자료형의 기본값으로 초기화되어져있다.
		//	int	 -> 0
		//	double -> 0.0
		//	string ->	null
		//	boolean - >	false
		//	char	-> null '\u0000
		
//		int [] kors = new int[3];
//		System.out.println(kors[0]);
//		System.out.println(kors[0]);
//		System.out.println(kors[0]);
		
//		kors[0];
//		kors[1];
//		kors[2];
		
		//윗첨자값(upperBound) = 배열크기 -1 					가독성을 우선시
//		int upperBound = kors.length-1;
//		for (int i =0; i <= upperBound; i++) {
//			System.out.printf("kors[%d]=%d\n",i,kors);
			
			
			
		}

	}


 


