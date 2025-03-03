package days17;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오전 9:41:15
 * @subject				
 * @content			final 은 상수
 */
public class Ex01 {

	public static void main(String[] args) {

		FinalTest obj = new FinalTest();
	}

}

class FinalTest{
	
	//The blank final field PI may not have been initialized
//	public final double PI = 3.14;	//명시적 초기화방법
	public final double PI;	//명시적 초기화방법
	{
		//The final field FinalTest.PI cannot be assigned
//		PI = 3.141592;	//인스턴스 초기화 블럭,한번 초기호 상수라는뜻
		
	}
	public FinalTest() {
		PI = 3.1415;	//생성자 는 단한번만 초기화 가능
	}
	public FinalTest(double pi) {
		PI = pi;	//생성자 는 단한번만 초기화 가능
	}
	
	public void plus(final int value) {		//매드안 파이널 사용가능
		final int MAX_VALUE = value;
	}
	
	
}