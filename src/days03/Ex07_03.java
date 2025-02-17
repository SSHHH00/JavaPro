package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 3:44:22
 * @subject	비교연산자 : 크고 작음, 같고 다름을 비교 
 * @content	ㄴ 결과값		boolean (true / false)
 * 
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
		int i = 10, j = 3;
		
		
		System.out.println( i > j); // true
		System.out.println( i < j); // false
		
		System.out.println( i >= j); // true
		System.out.println( i <= j); // false		>=,	<=	크거나 작다 표시가먼저
		
		//	i	 j 같다
//		System.out.println( i = j);		//대입연산자 j같은 i 변수에 대입하여 출력한다는 의미
//											ㄴ 습관적으로 = 한개만 쓰는 경우를 주의
		System.out.println( i == j);	//false
		System.out.println( i != j);	//ture		!= 다르다는 의미
		
//		잘못된 예 )System.out.println( i =! j); |	( i = !j) 로 인식됨
		
		
		
		
		
		

	}

}
