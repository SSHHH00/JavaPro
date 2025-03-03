package days17;

import java.util.ArrayList;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 2:16:10
 * @subject
 * @content		 싱글톤 때려넣기
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 		[ 인터페이스]
		 	1. 자바자료형 
		 		ㄴ 기본형 -자료형
		 		ㄴ 참조형 - 배열 , 클래스, 인터페이스
		 	2. 일종의 추상클래스 이다.
		 		ㄴ 100% 추상매서드
		 		ㄴ 일반 매서드 X
		 		ㄴ 상수만 선언가능.그외 필드는 선언 할 없다
		 	3. 인터페이스는 그자체만으로 사용되지 않고,
		 		다른 클래스를 작성하는데 도움을 줄 목적의 클래스
		 	4. 인터페이스 선언형식
		 		[접지]	interface 인터페이스명{
		 		}
		 		--클래스의 일종이기에 인터페이스명은 대문자로 시작한다.
		 	5. JDK 1.6 부터
		 		1) static 메서드
		 		2) default 매서드
		 	6. 인퍼페이스
		 		interface IA{
		 			void test();
		 			}

		 		interface I8 estendsIA{}		//상수만입력가능
		 	7. 어떤 클래스에서 인터페이스를 구현한다고 할때
		  		class A implements IB,,{	 콤마사용 값을 더 넣기 가능
		  		void Disp(){
		  			}
		  		}
		  		void test(){
		  			}
		  		}
		 */

		ArrayList<E>	//직렬화가 가능한?
	}//main

}//class

//클래스 설계 ~~ (인터페이스 사용)

//(군사) 부대,한사람, 단일체
class Unit{
	// [ 필드 ]
	//유닛의 위치

	int x;
	int y;

	int currentHP;	//현재 유닛의 체력

}
class GroundUnit{

}


// 하늘 유닛
// 땅 유닛
// 바다 유닛
class AirUnit extends Unit{
	//필드 매서드 구현
}

class Ground extends Unit{
	//필드 매서드 구현
}

interface Movable{
	// 상수 ,추상 매서드 + JDK 1.8 default, static 매서드
	void move(int x, int y);	//public abstract 키워드 생략 되어 있음

}
interface Attackable{
	void attack(Unit unit);
}
//인터페이스 끼리 상속이 가능하고 키워드는 extends 사용한다.
//인터페이스는 다중상소기 가능하다. 
interface Fightable extends Movable,Attackable{

}
// 어떤 클래스가 인터페이스를 구현하면 추상메소드를 오버라이딩 해야한다,
class  Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		//	구현됨
	}

	@Override
	public void attack(Unit unit) {
	}	//	구현됨


}

//유닛 - 탱크(수리가능) , 해병대원 ,수송선(수리가능)
//수리유닛 - SCV(수리가능)

class Tank extends GroundUnit implements Fightable{

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit unit) {
	}

}
class Marine extends Unit implements Fightable{
	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit unit) {
	}
}
class DropShip extends AirUnit implements Fightable{
	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit unit) {
	}
}
interface Repairable{
	//상수 추상메소드 X
	//인터페이만 생성한 상태

}
class SCV extends GroundUnit implements Repairable{

	void reapair(Repairable target) { 	//매개변수 다형성
		//수리코딩
		if( target instanceof Unit) {
			Unit u = (Unit)target;		//다운캐스팅
		}
	}
	/*
	void reapair(Tank tank) {
	}
	void reapair(DropShip dropShip) {
	}
	void reapair(SCV SCV) {
	}
	 */
}

































