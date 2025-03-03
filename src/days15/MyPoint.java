package days15;

public class MyPoint {
    // 필드
    public int x = 0;
    public int y;

    // 기본 생성자
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
    	//필드 초기화 코딩..
		this.x = x;
		this.y = y;
	}
    //매서드
    public MyPoint plusPoint(MyPoint p) {
    	x += p.x;
    	y += p.y;
    	
    	return this;	//this 의 3번째용도
    }
	// 좌표 출력 메서드
    public void dispMyPoint() {
        System.out.printf(" > x=%d, y=%d\n", this.x, this.y);
    }

    // 기본형 매개변수 사용 (값 증가)
    public MyPoint offsetPoint(int d) {
        x += d;
        y += d;
        return this; // 메서드 체이닝을 위해 자기 자신 반환
    }

    // 참조형 매개변수 사용 (다른 객체의 좌표값을 더함)
    public void offsetPoint(MyPoint p) {
        x += p.x;
        y += p.y; // 원래 코드에서 y += p.x; 였던 부분 수정
    }

    // 기본형 리턴자료형 (X좌표 값 계산 후 반환)
    public int plusPointX(int d) {
        return x + d;
    }
}
