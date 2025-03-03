package days17;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 12:41:37
 * @subject
 * @content			
  						추상화 abstract	
  					abstract 키워드
  					추상 메소드, 추상 클래스

  					추상클래스
  					공통적인 부분(멤버)만을 미리 선언한클래스
  					getPay()메소드 처럼 ..오버라이딩
  						추상메소드 선언

 */
public class Ex08 {

	public static void main(String[] args) {
		//추상 클래스도 일종의 클래스다
		//추상 클래스도 업캐스팅 가능하다.
		Player p = new CDPlayer();
		p.play(0);
		p.stop();
	}//main
}//class

abstract class Player{
	//필드
	boolean pause;
	int currentPos;

	//생성자
	public Player() {}

	//추상매서드 선언
	abstract void play(int pos);
	abstract void stop();
}
abstract class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("> 추상 매서드를 오버라이딩 완료");
	}

}
class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("> 추상매서들ㄹ 오버라이딩 완료!!!");
	}

}

