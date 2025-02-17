/**
 * 
 */
package days02;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 4. - 오후 3:29:24
 * @subject 정수형 변수 
 * @content
 * 
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// b(1), s(2), i(3), l(4)
		// [문제] 니이를 저장할 변수를 선언하세요.
		
/*		int age = 20; 
		b(1) [][][][][][][][]   -128 ~127가지 정수 
		s(2) [][][][][][][][]	[][][][][][][][]  -27678~27677 정수
		i(4) [][][][][][][][]	[][][][][][][][]	[][][][][][][][]	-21억~   // 표현범위를 정확히 파악할것.
		l(8) -900경 ~900경 정수
		
		
*/		
		byte age;
		age =20;
		System.out.printf( "age=%d\n",age);
		
		//[문제] 국어 점수를 저장할 변수 선언 95 할당.
		
		byte krScore;
		krScore = 95;
		System.out.printf("국어점수=%d\n",krScore);
		
	
	}

}
