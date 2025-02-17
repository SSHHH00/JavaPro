/**
 * 
 */
package days02;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 4. - 오후 3:52:59
 * @subject	java의 float double(실수형)과 형변환 오류설명
 * @content
 * 
 */
public class Ex05_05 {

	public static void main(String[] args) {
		// 실수 : float(4), double(8)
		
		//Type mismatch: cannot convert from double to float // 자료형이 8바이트 더블로 잡힘
//		float avg = 78.99f;  // 리터럴 + 접미사 (F , f 상관x)
		float avg = 0.f;  //  .입력 실수전환 리터럴 + 접미사	// 0f -> float 0을 의미
		
		
//		int i = 10l;  //접미사
//		//접미사 Type mismatch: cannot convert from long to int long형용
//		int i = 10;  //접미사
//		//Type mismatch: cannot convert from double to int 더블로 인식
//		System.out.printf("%d\n",i);
//	
		}

}
