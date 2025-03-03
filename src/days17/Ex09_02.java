package days17;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 2:07:07
 * @subject		클래스를 설계할때
 * @content		추상화작업
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// 추상화
		//	ㄴ 공통부분을 따로 뺴는것
		//	ㄴ 유닛 : 탱크,마린,수송선

	}//main
	class Unit{
		int x,y;
		void move(int x, int y)
		{}
	}
	class Marine extends Unit{
		void stimpack() {}
	}
}//class

//해병대원
//class Marine{
//	int x,y;
//	void move(int x, int y) {
//		
//	}
//	void stop() {
//		
//	}
//}
//class Tank{
//	void changeMode() {
//		
//	}
//}
//class DropShip{
//	void load() {}
//	void unload() {}
//}




