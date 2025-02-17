package days07;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 11:11:59
 * @subject	 문자열 분활과 향상된 for 문활용
 * @content split() 을 사용 문자열을 특정 구분자로( ,) 나누기
 */
public class Ex03 {

	public static void main(String[] args) {
		String data ="홍길동,이창익,서영학,정창기";
		String regex = ",";
		int[] carNum = new int[4];
		String [] names= data.split(regex); 
		
//		int size = names.length;
//		for (int i = 0; i < size; i++) {
//			System.out.printf("names[%d]=\"%s"\n",names[i]);
//		} // for i
//		System.out.println(Arrays.toString(names));
		//[for문]
		//배열명.lenth => 배열크기
		
		
		for (String name : names) {
			System.out.println(name);	//확장 for문 for.Each문
		}//for
		
		
		
		
		
		//문자열 매서드
		//1. char()
		//2. equals()
		//3. length()
		//4. valueOf()
		//5. toUppperCase() /toLowercase()
		//6. format
		//7. toCharArrays()
		//8. "-".repeat(50)
		//9
		
		
		
	}

}
 


