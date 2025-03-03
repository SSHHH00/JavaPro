package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오전 9:45:49
 * @subject
 * @content		
 */
public class Ex02 {

	public static void main(String[] args) {

//		Ex00 obj = new Ex00();
//		obj.aaa();
//		obj.bbb();
		
//		IC obj = new Ex00();	//인터페이스에 업캐스팅
		
		IA obj = new Ex00();	//
		
		
	}//main

}//class

interface IA{
	void aaa();
}
interface IB{
	void bbb();
}

interface IC extends IA, IB{
	
}

//class Ex00 implements IA , IB{
class Ex00 implements IC {
	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}



















