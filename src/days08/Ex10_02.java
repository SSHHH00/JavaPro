package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 5:28:44
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		swap();
	}//main

	private static void swap() {
		int x = 10, y =20;
		int temp = x;
		
		x = y;
		y = temp;
		
		System.out.println("x: " + x + " y: "+ y) ;
	}
}
 


