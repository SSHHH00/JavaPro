package days14;

import java.awt.Point;

/**
 * @author C_Seung_H0
 */
public class Ex06_02 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        

        System.out.printf("> x=%d, y=%d\n", p1.x,p1.y);
        swap(p1); // Call By Reference
        System.out.printf("> x=%d, y=%d\n",  p1.x,p1.y);
    } // main

    private static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		System.out.printf(" > swap x= %d, y=%d\n",  p.x,p.y);
	}

	private static void swap(int[] m) {
        System.out.printf("> swap x=%d, y=%d\n", m[0], m[1]);
        int temp = m[0];
        m[0] = m[1];
        m[1] = temp;
        System.out.printf("> swap x=%d, y=%d\n", m[0], m[1]);
    }

    private static void swap(int x, int y) {
        System.out.printf("> swap x=%d, y=%d\n", x, y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("> swap x=%d, y=%d\n", x, y);
    }
   
}
class point {
	int x;
	int y;
}
