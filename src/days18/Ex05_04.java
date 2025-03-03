package days18;

import java.util.Arrays;
import java.util.Random;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 12:46:44
 * @subject			
 * @content			1) try~ catch문 사용해서 예외처리
 */
public class Ex05_04 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int n = -1;

		int [] m = new int[10];

		for (int i = 0; i < 10; i++) {
			try { n = rnd.nextInt(5);	// 0 <= 정수
			result = number /n;
			//				m[i] = result;
			try { 
				m[i] = result;
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("배열크기부족");
			}
			
			//멀티 catch 블럭
			} catch (ArithmeticException e) {
				i--;
				//				System.out.println(e.toString());
			} catch (ArrayIndexOutOfBoundsException e) {		//다중 catch 블럭
				m = Arrays.copyOf(m, m.length +5);
				System.out.println(e.toString());
			} catch (Exception e) {
				// 예외처리 코딩
				e.printStackTrace();
//				syso( e.getMessage());
			}
		}//for

	}

}
