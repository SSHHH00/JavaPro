package days09;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오후 12:14:37
 * @subject			subString매서드 사용
 * @content			repeat? split 사용도 가능,
 */
public class Ex03_03 {

	public static void main(String[] args) {
		/*주민등록번호 Resident registration number)
		 * 
		 * 			1)
		 * 			2)
		 */
		String minZ = "830412-170000";
//		int front = 0;
//		int back = 7;	
//		
//		System.out.println(minZ.substring(front,back)+"*******");
		
		//[문제 뒷자리 7개출력
		int front = 0;
		int back = 7;	
//		
		System.out.println(minZ.substring(front,back)+"*******");
		int backNum = minZ.length();
		System.out.println(backNum);

	}

}
 


