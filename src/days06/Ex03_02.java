package days06;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 2:00:34
 * @subject continue
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 7, 8, 9, 10};

        System.out.println("짝수만 출력:");
        for (int num : numbers) {
            if (num % 2 == 0) {
            System.out.printf("짝수 :%-10d%n",num);
		}else {
			System.out.printf("홀수 :%-10d%n",num);
			}
			}

}
 
}

