package days10;

import java.util.Iterator;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 11:35:39
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {

		// 별찍기
		for (int i = 1; i <= 4; i++) { // 행
			for (int j = 1; j <= 4; j++) {
				System.out.print("*"); // 열
			} // for j
						System.out.println();			//개행
		} // for i
	}

}
