package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 5:29:45
 * @subject			재귀 [호출] 함수? 함수안에서 자기 자신을 다시 호출하는 함수.
 * @content		
 */
public class Ex11 {

	public static void main(String[] args) {
		disp();
		
	}

	private static void disp() {
		System.out.println("disp() 호출됨...");
		disp(); //자기 자신 함수 호출 부분
	}

}
 


