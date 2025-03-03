package days14;

/**
 * @author C_Seung_H0
 *			클래스 (객체) 배열
 *				ㄴ배열?
 */			
public class Ex08_02 {
	public static void main(String[] args) {
		
		Person [] pArr = new Person[5];
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		} //for
		pArr[0].name = "권태정";
		pArr[1].name = "김가은";
		pArr[2].name = "김도훈";
		pArr[3].name = "김민선";
		pArr[4].name = "김승효";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		} //for
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].run();
		} //for
		
	}
}
