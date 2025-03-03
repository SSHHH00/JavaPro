package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 2:16:17
 * @subject
 * @content        2.  StringBuffer 클래스
 					3. StringBuilder 클래스
 */
public class Ex05 {
	public static void main(String[] args) {

		//(암기) 불변
		//3. 수정 method -> 메소드
//		System.out.println( s.);
		String s = "TODO Auto-gernerated method stub";
		
//		StringBuffer sb = new StringBuffer(s);		//멀티스레드에 안전 x
//		StringBuilder sb = new StringBuilder(s);	//멀티스레드에 안전함( ==동기화처리되어있음)
		
//		System.out.println(sb);
//		System.out.println(sb);
		
		// Auto 라는 문자열을 찾아서 [hi] 문자열 삽입
		
		//1. 삽입
		int index = s.indexOf("Auto");
		int len = "Auto".length();
		System.out.println(s.substring(0,index + len) + "[hi]"+ s.substring(index +len));
		
		StringBuilder sb = new StringBuilder(s);
		
		// String s에서 "method" 문자열을 찾아서 삭제
		index = s.indexOf("method");
		len = "method".length();
		System.out.println(s.substring(0,index)+ s.substring(index + len));
		
		//1 삽입
		sb.insert(index , len);
		// 2 삭제
//		sb.delete(index, len);
		//3. method -> 메소드 수정
		int start = sb.indexOf("method");
		int end = start + "method".length();
		sb.replace(start, end, "메소드");
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
	}//main
}//class















