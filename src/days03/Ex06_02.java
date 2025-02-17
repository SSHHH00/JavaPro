package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 2:11:20
 * @subject
 * @content // Type Convert ( 형변환 ) // 1) 자동 형 변환 // 2) 강제 형 변환
 * 
 * 
 */
public class Ex06_02 {

	// Type Convert ( 형변환 )
	// 1) 자동 형 변환
	// 2) 강제 형 변환

//		int	 ->	byte///같은 정수끼리 바뀌어도 형변환
//				
	// [문제]
	// 이름, 국어, 영어, 수학 점수를받아서
	// 총점
	// 평균
	// [ 출력 ]
	// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
	// 자료형 끝날때까지 byte 사용

//		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner 클래스

		String name = null;

		byte kor = 0, eng = 0, mat = 0;
		short tot;
		double avg;

		System.out.println("이름입력 ?");
		name = br.readLine(); // br.readLine() 은 항상 string으로 반환함

		System.out.println("국어입력 ?");
		kor = Byte.parseByte(br.readLine()); // Byte.parseByte 문자열을 byte형으로반환

		System.out.println("영어입력 ?");
		eng = Byte.parseByte(br.readLine());

		System.out.println("수학입력 ?");
		mat = Byte.parseByte(br.readLine());

//		Type mismatch: cannot convert from int to short
//		tot = kor + eng + mat;		인티제보다 작은 것을 계산할때 내부적으로 4바이트로 계산됨
//										ㄴ 결론. 인티제로 나옴

		tot = (short) (kor + eng + mat); // 오류메세지 클릭지 add~ 메세지 출력
//			  캐스트연산자 숫자타입 같은 형식만 가능.

		avg = (double) tot / 3; // 앞코드 or 뒷코드 한곳에 캐스트계산자 실수가 나오게 됨

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", name, kor, eng, mat, tot, avg);

		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33

	}// main

}// class
