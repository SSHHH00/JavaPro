package days10;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 3:12:31
 * @subject 배열의 가장 큰 단점 : 자동으로 크기가 증가하지 않음
 * @content 
 */
public class Ex04_02 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] korArr = new int[3]; // 초기 크기 3
        int score;
        int index = 0; // 현재 입력된 학생 수
        String regex = "^(100|[1-9]?[0-9])$"; // 0~100 정규 표현식
        char con = 'y';

        do {
            // 학생 점수 입력
            do {
                System.out.printf("학생 %d 점수 입력 (0~100): ", index + 1);
                score = sc.nextInt();
            } while (!String.valueOf(score).matches(regex)); // 정규식 체크 (유효 점수인지 확인)

            // 배열 크기 초과 시 동적 증가
            if (index == korArr.length) {
                int[] temp = new int[korArr.length + 2]; // 배열 크기 +2 증가
                for (int i = 0; i < korArr.length; i++) {
                    temp[i] = korArr[i];
                }
                korArr = temp; // 새로운 배열로 교체
            }

            korArr[index++] = score; // 점수 저장 후 인덱스 증가

            // 계속 입력 여부 확인
            System.out.print("> 계속 입력? (Y/N): ");
            con = (char) System.in.read();
            System.in.skip(System.in.available()); // 버퍼 비우기

        } while (con == 'Y' || con == 'y');

        // 점수 출력
        dispScore(korArr, index);
        
        //

        // 입력한 수 출력
        System.out.printf("> 입력한 학생 수: %d명\n", index);
    }

    // 점수 출력 메서드
    private static void dispScore(int[] korArr, int index) {
        System.out.println("\n[ 입력한 학생 점수 목록 ]");
        for (int i = 0; i < index; i++) {
            System.out.printf("학생 %d : %d점\n", i + 1, korArr[i]);
        }
    }
}
