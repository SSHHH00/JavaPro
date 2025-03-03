package days16;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 11:10:29
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//가변인자 사용중
		System.out.printf("");
		String [] names = {
				"홍길동",
				"김민곤",
				"이찬희",
				"오재문"
		};
		System.out.println(joinNames("-",names));
	}//main

	public static String joinNames(String delimiter, String...args) {
		return String.join(delimiter, args);
	}
}//class
