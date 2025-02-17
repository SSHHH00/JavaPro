package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {
        // 1~100 사이의 중복 없는 랜덤 정수 10개 생성
        int[] m = new Random().ints(1, 101).distinct().limit(10).toArray();
        System.out.println("배열: " + Arrays.toString(m));

        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("> 정수 입력(n)? ");
        int n = scanner.nextInt();  

        // 배열의 각 값과 입력값 n의 차이를 저장하는 배열
        int[] m2 = Arrays.stream(m)
                .map(value -> Math.abs(value - n)) // 절댓값 변환
                .toArray();
        System.out.println("차이 배열: " + Arrays.toString(m2));

        // 가장 작은 차이값 찾기
        int minDiff = Arrays.stream(m2).min().getAsInt();
        System.out.println("최소 차이: " + minDiff);

        // 최소 차이를 가지는 원소 출력
        System.out.println("가장 가까운 값(들):");
        IntStream.range(0, m.length)
                .filter(i -> m2[i] == minDiff)
                .forEach(i -> System.out.printf("위치: %d, 값: %d\n", i, m[i]));

        scanner.close();
    }
}
