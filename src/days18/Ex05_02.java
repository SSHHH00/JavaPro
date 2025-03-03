package days18;

import java.util.Random;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 12:46:44
 * @subject
 * @content	
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5);
			if (n == 0) {
				i--;
				continue;
			} //if
			result = number /n;
			System.out.println(result);
		} //for
	}

}
