package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 4:27:46
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// [문제] 1년~ 2025년 까지 총 몇 번의 윤년이 있었는지?
		//com.utill.myclander
		int leapYearCount = 0;
		leapYearCount = 2025/4	-	2025/100 + 2025/400;
		System.out.println(leapYearCount);
	}

}
 


