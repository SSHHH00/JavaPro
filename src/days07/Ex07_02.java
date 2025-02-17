package days07;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 11:50:43
 * @subject
 * @content
 */
public class Ex07_02 {
    public static void main(String[] args) {
    	
        int user;
        Scanner scanner = new Scanner(System.in);
        boolean isFirst = false;
        int count = 0;

        do {
            if (count == 3) {
                System.out.printf("[알림] 실패횟수: %d\n프로그램 종료!!!\n", count);
                scanner.close();
                return; // 프로그램 강제 종료
            } if (isFirst) {
                System.out.printf("[알림] 1~3 정수를 다시 입력 (실패횟수: %d)!!!\n", count);
            }isFirst = true;
            System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
            user = scanner.nextInt();
            count++;
        } while (!(user == 1 || user == 2 || user == 3)); // 1~3만 입력 가능

        scanner.close();
        
        
        
        
        
        
    }
}
