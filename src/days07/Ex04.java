package days07;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 12:04:19
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 구구단 출력 for문 사용 가로로 출력
		// 1~9까지 곱하는 수 (행)
        for (int i = 1; i <= 9; i++) {
            // 2~9단 출력 (열)
            for (int dan = 2; dan <= 9; dan++) {
                System.out.printf("%d * %d = %2d\t", dan, i, dan * i);
            }
            System.out.println();
        }
	}//main

}//class
 


