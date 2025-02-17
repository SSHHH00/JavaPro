package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 9:46:23
 * @subject
 * @content	
 * 10진수 정수를 입력받아서 2진수로 출력하는 메서드를 선언하세요. 
   (조건: 제어문을 사용해서 직접 로직으로 처리하세요.) 
   (2진수 출력형식: "00001010")
   (메서드명 : binaryConvert)
 */
public class Ex01 {

	public static void main(String[] args) {
		int n = 10; // 변환할 10진수
		String result = binaryConvert(n); // 변환 메서드 호출
		System.out.println("2진수 변환 결과: " + result);
	} // main

	// 10진수를 2진수로 변환하는 메서드
	private static String binaryConvert(int n) {
		// 2진수 변환 결과를 저장할 StringBuilder
		StringBuilder binary = new StringBuilder();
		
		// 10진수 -> 2진수 변환
		while (n > 0) {
			int rest = n % 2; // 나머지
			binary.insert(0, rest); // 앞쪽에 추가 (문자열 순서 유지)
			n = n / 2; // 몫을 갱신
		}

		// 8자리 맞추기 (부족한 경우 앞에 '0' 채우기)
		while (binary.length() < 8) {
			binary.insert(0, "0");
		}

		return binary.toString();
	} // binaryConvert

} // class
