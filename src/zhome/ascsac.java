package zhome;

public class ascsac {
	public static void main(String[] args) {
		
	
	Player p = new CDPlayer();
	p.play(0);
	p.stop();
}
}


abstract class Player{

	// 필드
	boolean pause;  // 작동 중지
	int currentPos; // 현재 위치

	// 생성자
	public Player() { }

	// 추상 메서드 선언
	abstract void play(int pos);
	abstract void stop();
}

abstract class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
	}

}

class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
	}

}