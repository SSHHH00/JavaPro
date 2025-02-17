package days06;
import java.util.Arrays;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 2:13:38
 * @subject		//{10, 31, 98, 38, 68, 91, 95, 76, 27, 29}
 * @content		// 세정수 (n,m,o)둘ㄹ레 가장 큰값, 작은값
				//[문제]20개 정수 중에 가장 큰값, 가장 작은값을 출력
				//배열 사용
				//10, 31, 98, 38, 68, 91, 95, 76, 27, 29
 */	
public class Ex04_06 {
	public static void main(String[] args) {
		// 1. 배열 선언 (기존 값은 덮어씌워짐)
        int[] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29}; 
        m = new int[10]; // 새로운 배열 생성 (기존 데이터 사라짐)

        // 2. 랜덤 값으로 배열 채우기 (0~100 사이 정수)
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 101);
        }

        // 3. 배열 출력
        System.out.println("배열: " + Arrays.toString(m));

        // 4. 최댓값, 최솟값 찾기
        int max = m[0], min = m[0];
        for (int i = 1; i < m.length; i++) {
            max = Math.max(max, m[i]);
            min = Math.min(min, m[i]);
        }

        // 5. 최댓값, 최솟값 출력
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
	}

}
 


