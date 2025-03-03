package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 3:05:56
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
	      , solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	      */
	      
		String result = solution(3);
//		String result = solution(4);
		
		System.out.println(result);
		
		
		
	}//main

	private static String solution(int n) {
		StringBuffer answer = new StringBuffer();
		for (int i = 1; i <= n/2; i++) {
			int share = n/2;
			if(i%2 ==0) {
				answer.append("수박");
			}
		} //for
		if(n%2==1) answer.append("수");
		return answer.toString();
	}

}//class





















