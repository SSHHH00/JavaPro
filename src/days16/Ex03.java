package days16;

import java.security.PublicKey;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 10:47:21
 * @subject
 * @content	[가변인자]
 * 				JDK1.5 매서드의 매개변수의 갯수가 고정 -> 동적지햘할 수 있다.
 */
public class Ex03 {

	public static void main(String[] args) {
		//2. 정수의 합을 구해 반환하는 매서드
		
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
	}//main

	//2. 정수의 합을 구해 반환하는 매서드
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	public static int sum(int... args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result; // 잘못된 부분 수정 (result result; → return result;)
    }
}