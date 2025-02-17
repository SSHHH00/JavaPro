package days05;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오전 10:03:36
 * @subject			이퀄매서드 사용 (
 * @content		equalsIgnoreCase()는 대소문자를 무시하고 문자열을 비교하는 메서드야.
 */
public class Ex02 {

	public static void main(String[] args) {
		//		int i = Integer.MAX_VALUE;
		//		long l = i +100;
		//		System.out.println(l);
		//
		//		int i = Integer.MIN_VALUE;
		//		System.out.println(l);


		//		String n1 = "admin", n2 = "Admin";						[ 1 ] 번 풀이
		//		// == X
		//		// ?: 삼항연산자 /조건연산자
		//		System.out.println( n1.equals(n2)? "같다": "다르다 ");
		//		
		//		if (n1.equals(n2)) {
		//			System.out.println("같다");
		//		}else {
		//			System.out.println("다르다");
		//		}

				String n1 = "admin", n2 = "Admin";
				//대소문자를 구분하지 않고 문자열 비교
				System.out.println(n1.equalsIgnoreCase(n2));
//				n1 = n1.toUpperCase();
//				n1 = n2.toUpperCase();
				
				
//				n1 = n1.toLowerCase();
//				n2 = n2.toLowerCase();
//				
//				System.out.println();
//				System.out.println(n1.equals(n2));
//		
		

	}

}
 


