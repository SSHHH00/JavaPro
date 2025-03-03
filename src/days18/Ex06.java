package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 2:30:02
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		//try~ catch 블럭 실행 이해
		System.out.println("1");

		try {
			System.out.println("2");
			System.out.println(100 /10);	//예외 발생
			System.out.println("3");
		} catch (ArithmeticException e) {	//ArithmeticException (산술 예외)
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally {		// 이블럭은 try{} 블럭에서 예외가 발생 유무에 상관없이
						//	실행할 코딩을 하는 블럭이다.
			System.out.println("6 - DB Close...");
		}
		System.out.println("7");
		System.out.println("end");

















	}

}
