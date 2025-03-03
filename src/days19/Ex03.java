package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 10:06:48
 * @subject		어떤 객체로부터 클래스 정보를 얻어오는 3가지 방법.
 * @content					Class 객체 얻어오기 
 */
public class Ex03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);
		
		/*
		  [ 1 ]
		//Class 객체 첫 번째 방법
		Class cls = c1.getClass();
		String fullname = cls.getName();
		System.out.println(fullname);
		*/
		
		// 두번째 방법 = 모든 클래스 static 필드 : class
/*		Class cls =Card.class;	
		//cls 를 사용해서 Car 객체(인스턴스) 생성.
		//new Card();		//인스턴스생성코드
		try {
			Card c2 = (Card) cls.newInstance();
				System.out.println(c2);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			//cls 클래스 타입으로 부터 새로운 인스턴스를 생성후 반환
*/
		// 	[ 세번째 방법	]
		String className = "days19.Card";		//존재 하지 않을 시 예외 발생
		try {
			Class c3 = Class.forName(className);		//JDBC 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}//main

}//class

//final 클래스	: 최종클래스
//final 매서드	: 재정의 할 수 없다.
//final 필드		: 상수
//final 지역변수 : 상수

final class Card{
	
	Card(){
		this("SPADE",1);
	}
	
	String kind;	//카드 종류
	int num;		//카드 번호
	Card(String kind , int num){
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return String.format("%s : %d ", this.kind, this.num);
	}
}




















