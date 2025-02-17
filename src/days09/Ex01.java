package days09;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오전 10:08:46
 * @subject 복습 1번 문제 2월 13일
 * @content
 */
public class Ex01 {

    public static void main(String[] args) {
        int sum = 0;

        // 1부터 100까지 소수를 찾아 합산
        for (int i = 1; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%d+", i);
                sum += i;
            }
        }

        System.out.printf("=%d\n", sum);
    }

    // 소수 판별 함수
    private static boolean isPrimeNumber(int n) {
        if (n < 2) {  // 1 이하의 수는 소수가 아님
            return false;
        } 
        else if (n == 2) { // 2는 소수
            return true;
        } 
        else if (n % 2 == 0) { // 짝수는 2를 제외하고 소수가 아님
            return false;
        } 
        else { // 3부터 홀수만 검사
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
