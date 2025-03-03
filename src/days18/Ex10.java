package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 4:34:30
 * @subject
 * @content		
 * 		chapter 12. Object 클래스 설명
 			ㄴ	모든 클래스의 최상위 부모 클래스
 			getclass 객체의 클래스 정보를 가져오는 매서드
 			
 */
public class Ex10 {
	public static void main(String[] args) {

//		[ 1 ]
/*		Value v1 = new Value(10);
		int hash1 = v1.hashCode(); // 변수명 변경
		System.out.println(hash1); // 객체의 해시코드

		Value v2 = new Value(10);
		int hash2 = v2.hashCode(); // 변수명 변경
		System.out.println(hash2); // 객체의 해시코드

		Value v3 = new Value(10);
		int hash3 = v3.hashCode(); // 변수명 변경
		System.out.println(hash3); // 객체의 해시코드
*/
		// [ 2 ]
/*		Value v1 = new Value(10);
		Class cls = v1.getClass();		//객체의 정보를 [C]lass 반환하는 매서드
		String name = cls.getName();
		System.out.println(name);		//days18.Value
*/
		//매서드 , 생성자 , 필드 등 모든 클래스 정보를 얻어올때 사용하는매서드
		
		//
		// [ 3 ]
		//객체 자신의 정보를 문자열으로 반환하는 매서드
/*		System.out.println(v1.toString());
		System.out.println(v1);	//toString() 생략해도 된다.
		
		System.out.printf("%s@%x",	cls.getName(), v1.hashCode());
*/		
		// [ 4 ] 
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println( v1 == v2);
		
		Value v3 = v1;	// 객채복사(copy)
		System.out.println( v1 == v3);	//true
		// [ 1 ] object.equals() 매서드를 오버라이딩하지 않으면 == 연산자 동일한 기능이다
		// [ 2 ] 오버라이딩 int value 필드	필드값이 같으면 같은 객체이다..true
		System.out.println(v1.equals(v2));	//false
		System.out.println(v1.equals(v3));	//true
		
		System.out.println(v1);				//Value : 10
		
		
		
		
		
		
		
		
	}//main
}//class

class Value extends Object {
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value && obj != null) {
			Value v = (Value)obj;	//다운캐스팅
			return v.value == this.value;
		} //if
		return false;
	}
	@Override
	public String toString() {
		return String.format("Value : %d", this.value);
	}
	//필드
	int value;
	//생성자
	public Value(int value) {
		this.value = value;
	}
}


















