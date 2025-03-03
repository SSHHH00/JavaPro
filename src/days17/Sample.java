package days17;

public interface Sample {

	//1. 모든 (변수 선언 X, 상수만 선언 + public static 생략.
//	public static final int MAX_VALUE = 100;9
//		ㄴ public static final int생략 가능
	
	int MAX_VALUE = 100;
	
	//2. 추상메소드
	public abstract void test();
	int disp(int a, int b); //public stataic 이 생략된 경우
	
}
