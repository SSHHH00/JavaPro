package days02;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 4. - 오후 2:49:54
 * @subject printf()를 활용한 다양한 출력 형식
 * @content 형식 지정자 및 출력 방식 설명
 */
public class Ex05_03 {

    public static void main(String[] args) {

        double avg = 78.96844;
        
        // 실수 출력 (기본 소수점 6자리까지 출력)
        System.out.printf("평균 = %f\n", avg);

        // 소수점 2자리까지 출력
        System.out.printf("평균 = %.2f\n", avg);

        // 지수형식으로 출력
        System.out.printf("평균 = %.2e\n", avg);

        // printf() 형식
        // %[argument_index$][flags][width][.precision]conversion

        String name = "admin";
        int age = 20;

        // 문자열 출력
        System.out.printf("[%s]\n", name);
        System.out.printf("[%10s]\n", name);  // 우측 정렬 (10칸 확보)
        System.out.printf("[%-10s]\n", name); // 좌측 정렬 (10칸 확보)

        // 정수 출력
        System.out.printf("[%d]\n", age);
        System.out.printf("[%10d]\n", age);  // 우측 정렬 (10칸 확보)
        System.out.printf("[%-10d]\n", age); // 좌측 정렬 (10칸 확보)

        // 나이(age)를 4자리로 출력 (앞에 0 채우기)
        System.out.printf("[%04d]\n", age);  // 0020

        int money = 12_573_000;

        // 세 자리마다 콤마 출력
        System.out.printf("[%,d]\n", money); // 12,573,000

        // 음수값을 괄호로 표시 (양수와 비교)
        System.out.printf("양수: [%d]\n", 30);
        System.out.printf("음수: [%(d]\n", -30);

        System.out.println("-".repeat(50));

        int num = 10;
        // 정수를 다양한 진법으로 출력
        System.out.printf("10진수: [%d]\n", num);
        System.out.printf(" 8진수: [%o]\n", num);
        System.out.printf(" 8진수 (접두어 포함): [%#o]\n", num);
        System.out.printf("16진수: [%#x][%#X]\n", num, num); // 소문자/대문자

        /*
         * 숫자의 진법 표현
         *  2진법 : 0, 1
         *  8진법 : 0 ~ 7
         *  10진법 : 0 ~ 9
         *  16진법 : 0 ~ 9, A ~ F
         */

    } // main
} // class
