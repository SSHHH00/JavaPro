package days19;

import java.util.StringTokenizer;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 3:22:57
 * @subject
 * @content
 * 
 *				 4. StringTokenizer클래스		==String.split();	Ex05_04.java
 */
public class Ex05_04 {

	public static void main(String[] args) {
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//					   [Token][Token][Token][Token][Token]
		
		// [ 1 ], 권장
		//		String [] teamArr =  team1.split("\\s*,\\s*");

		// [ 2 ] 
		StringTokenizer st = new StringTokenizer(team1,",");
		//		System.out.println(st.countTokens());	//token 카운팅
		//		true/falsest.hasMoreTokens();			//다음 토큰(단어)이 남아 있는지 확인하는 역할
		//		st.nexttoken();
		while (st.hasMoreElements()) {
			String name = st.nextToken();
			System.out.println(name);
		} //while




	}

}

















