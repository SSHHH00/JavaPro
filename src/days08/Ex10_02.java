package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 5:28:44
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int [] m = { x, y };
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
        swap( m ); // Call By Reference
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);

	} // main

	private static void swap(int[] m) {
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
		int temp = m[0];  
		m[0] = m[1];         
		m[1] = temp;  	
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
	}

	private static void swap(int x, int y) {
		System.out.printf("> swap x=%d, y=%d\n", x, y);
		int temp = x;  
		x = y;         
		y = temp;  		
		System.out.printf("> swap x=%d, y=%d\n", x, y);
	}

} // class


