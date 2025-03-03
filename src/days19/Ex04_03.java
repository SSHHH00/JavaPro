package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 11:41:16
 * @subject
 * @content			URL Uniform resource Locator
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
//		System.out.println("abC".compareTo("abc"));
//		System.out.println("abC".compareToIgnoreCase("abc") );
		
		String url = "wwww.naver.com";
//		String url = "ftp.naver.com";
//		String url = "http.naver.com";
		
//		url.substring(0, 7).equals("http://");	
		String prefix = "http://";
		System.out.println(url.startsWith(prefix));	//prefix 로 시작하는지 확인 매서드
		
		String fileName = "Sample.java";
		String subfix = ".java";
		fileName.endsWith(subfix);					//subfix 값으로 끝나는지 확인 매서드
		
		
		
	}//main

}//class
