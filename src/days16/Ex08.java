package days16;

import java.io.IOException;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오후 2:43:08
 * @subject			
 * @content			오버로딩 vs 오버라이딩
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {

		// 부모 클래스 객체
		Shape s = new Shape();
		s.draw(); // 예외처리된 메소드 실행

		// Circle 객체 생성 및 테스트
		Point2D center = new Point2D(50, 100);
		int radius = 30;
		Circle c = new Circle(center, radius);
		c.drawColorCenter(); // 원의 정보 출력

		// Triangle 객체 생성 및 테스트
		Point2D[] points = {new Point2D(0, 0), new Point2D(50, 100), new Point2D(100, 0)};
		Triangle t = new Triangle(points);
		t.draw();
	}
}

// 도형 클래스 선언
class Shape {

	// 필드 
	String color = "black"; // 명시적 초기화

	// 메소드 (예외 처리 추가)
	public void draw() throws IOException {
		System.out.printf("color = %s\n", color);
	}
}

// 원은 도형이다. (is-a 관계)
class Circle extends Shape {
	// 필드
	Point2D center;	// 원점
	int r; // 반지름(radius)

	// 생성자
	public Circle(Point2D center, int r) {
		this.center = center;
		this.r = r;
	}

	// 기본 생성자
	public Circle() {
		this(new Point2D(0, 0), 0);
	}

	// 원 정보 출력 메소드 추가
	public void drawColorCenter() {
		System.out.printf("[color=%s], ", color);
		center.showPoint(); // 원점 좌표 출력
		System.out.printf(" 반지름: %d\n", r);
	}

	// 부모 클래스의 draw()를 오버라이딩 (Overriding)
	@Override
	public void draw() throws IOException {
		drawColorCenter();
	}
}

// 삼각형 클래스 선언 (is-a 관계: Shape 상속)
class Triangle extends Shape {
	// 필드: 꼭짓점 3개
	Point2D[] p = new Point2D[3];	// 3개의 꼭짓점을 저장하는 배열

	// 생성자
	public Triangle(Point2D[] p) {
		this.p =
