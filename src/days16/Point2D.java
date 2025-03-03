package days16;

// 부모 클래스
public class Point2D {
	
	private int x;
	private int y;
	
	// 기본 생성자
	public Point2D() {
		this(0, 0); // 기본값 (0,0)으로 초기화
		System.out.println("> Point2D 디폴트 생성자 호출");
	}

	// x값만 받는 생성자
	public Point2D(int x) {
		this(x, 0); // y는 기본값 0
		System.out.println("> Point2D(x) 생성자 호출");
	}

	// x, y 둘 다 받는 생성자
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("> Point2D(x, y) 생성자 호출");
	}

	// Getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// Setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 좌표 출력 메소드 추가
	public void showPoint() {
		System.out.printf("Point2D 좌표: (%d, %d)\n", x, y);
	}
}
