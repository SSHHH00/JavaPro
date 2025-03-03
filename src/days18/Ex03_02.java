package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오전 10:27:03
 * @subject			각각 내부 클래스 사용여부 확인
 * @content
 */
public class Ex03_02 {
	
	// 1. 인스턴스 클래스
	class InstanceClass{		
		int iv = 100;					//인스턴스 변수 선언{}
//		The field cv cannot be declared static in a non-static inner type, unless initialized
//		with a constant expression
//		static int cv =100;				//클래스 변수선언 XX
		final static int COUNT = 100;	//상수선언 O

	}
	
	// 2. 정적클래스 
	static class StaticInner{
		int iv = 100;					//인스턴스 변수 선언 OO
		static int cv =100;
		final static int COUNT = 100;
	}
	
	void method() {
		
		//3. 로컬 클래스
		class LocalInnerr{
			int iv = 100;						//클래스 변수선언 OO
			final static int COUNT = 100;		//상수선언 O
		}
		
		
	}
	public static void main(String[] args) {

//		InstanceClass.COUNT;
//		StaticInner.COUNT;
//		StaticInner.cv;

	}

}






















