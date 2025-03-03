package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 12:07:42
 * @subject		파일의경로 가져오기 
 * @content		원하는 경로 추출, 
 */
public class Ex04_04 {

	public static void main(String[] args) {

		String path = "C:\\temp\\src\\day01\\Sample.java";
		
		String fileName;		//Sample.java
		fileName = path.substring((path.lastIndexOf("\\")+1));
		System.out.println(fileName);
		
		String ext;				//.java		확장자만
		String baseFileName;	// Sample	확장자를 제거한 파일명
		
		baseFileName = fileName.split("\\.")[0];
		ext = fileName.split("\\.")[1];
		
		System.out.println(baseFileName);
		System.out.println(ext);
		
		String [] urls = { "wwww.naver.com",
							"ftp.naver.com",
							"http.naver.com"
							};
		String regex = "http://.*";
		for( String u : urls) {
			if( u.matches(regex) ) System.out.println(u);
		}
		System.out.println("end");
		
		
		
		
		
		String s = "public static void 메인(String[] args) {";
		String sh = "main";
		
		//  s 문자열 속에 한글을 제외한 모든 문자는 제거..
	 
		System.out.println(s.replaceAll("[a-zA-Z() {}]", ""));
					//.한글은 제외 정규표현식
		
		
		
		
		
		
		
	}//main

}//class
