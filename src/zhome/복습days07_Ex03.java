package zhome;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 10:22:51
 * @subject
 * @content
 */
public class 복습days07_Ex03 {

	public static void main(String[] args) {
		//String data ="홍길동,이창익,서영학,정창기";
		
		
		
		String data = "홍길동,  이창익,		서영학, 				정창기";
		String regex = "\\s*,\\s*";
		String[] names = data.split(regex);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
 


