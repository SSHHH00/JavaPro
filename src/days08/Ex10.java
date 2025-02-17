package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 4:44:59
 * @subject		두 기억공간의 값을 바꾸기.
 *@content	매개변수를 가지고 매서드를 호출하는 방법
 * 					1)Call by Name		drayLine()
 * 					1)Call by value			sum(10)		isLeayear(i)
 * 					1)Call by 				Reference ***
 */					
public class Ex10 {

	public static void main(String[] args) {
		int x = 10, y =20;
		System.out.println(x);
		

		System.out.printf(">x=%d, y=%d\n", x, y);		
		
		/*	swap매서드 선언 + 호출
		{int temp = x;		
		x = y;			
		y = temp;
		}
		 */
		swap(x,y);
		System.out.printf("> x=%d , y=%d \n", x, y);

		
	}//main

	private static void swap(int x, int y) {
		int temp = x;		
		x = y;			
		y = temp;
		
	}
}//class



