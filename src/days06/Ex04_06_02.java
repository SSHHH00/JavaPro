package days06;

import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 2:37:07
 * @subject			람다식과 스트림을 활용한 배열 최댓값 찾기
 * @content
 */
public class Ex04_06_02 {

	public static void main(String[] args) {
		 //람다식과 스트림 
		int[] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
        OptionalInt max = IntStream.of(m).max();

        max.ifPresent(value -> System.out.println(value));

        Scanner sc = new Scanner(System.in);
        int putNum = sc.nextInt();
        
        if (max.isPresent() && putNum > max.getAsInt()) {
            System.out.println("입력한 숫자가 배열의 최대값보다 큽니다.");
        } else {
            System.out.println("입력한 숫자가 배열의 최대값보다 작거나 같습니다.");
        }
        
        sc.close();

	}	

}
 


