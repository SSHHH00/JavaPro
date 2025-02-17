package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 11:18:52
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
// "5만원","1만원","5천원", "1천원", "5백원",
//  "1백원","5십원","1십원","5원","1원" };
		int money = 125760;
		int unit = 50000;
		int num = 0;
		boolean sw = false;
		
		while (unit >= 1) {	 // 화폐 단위가 1원 이상일 때만 반복
			num = money /unit;	 // 현재 단위(unit)로 나눈 개수 계산
			System.out.printf("%d원 : %d 개 \n",unit,num);
			money %= unit;	// 현재 단위로 나눈 나머지 금액 계산
			unit /= ( sw ? 2 : 5);
			sw = false;
		} //while
		
	}

}
