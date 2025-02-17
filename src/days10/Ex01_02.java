package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 10:34:08
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//16진수로 변환
		int n = 31;
		
		int m =37;
		
		System.out.println(Integer.toBinaryString(n));	//2진수변환
		System.out.println(Integer.toOctalString(n));	//8진수 변환
		System.out.println(Integer.toHexString(m));		//16진수 변환
	}

}
