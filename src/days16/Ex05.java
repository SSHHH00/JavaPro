package days16;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 11:26:09
 * @subject
 * @content				
 */
public class Ex05 {
	public static void main(String[] args) {
		/*
		 		[변수 초기화 설명]
		 	1.변수
	 		2.변수 종류
	 		3.변수의 초기화 - 변수를 선언하고 처음으로 값을 할당하는 것.
			4.지역변수는 반드시 초기화를 해야 사용할 수 있다
	 		인스턴스 변수,클래스변수는 초기화 하지 않으면 각 자료형의
	 		기본값으로 초기화 되어져 있다.
	 		[ 5. 필드의 초기화 방법 ] 
	 		1) 명시적 초기화
	 		2) 생성자 초기화
	 		3) 초기화 블럭 사용.
		 */
		Member m1 = new Member();		//객체 한번 생성
		System.out.println(m1.name);
		System.out.println(m1.age);		//필드가 가지고 있는 자료형
		
		Member m2 = new Member();		//객체 두번 생성
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		System.out.println( m2.rate);
		
	}//main

}//class

class Member{
	//필드
	// ㄱ. 인서턴스 변수
	String name = "홍길동";		// <= 명시적 초기화
	int age= 20;				// <= 명시적 초기화
	
	int	count;
	int serialNumber;
	// ㄴ 클래스 변수
	static double rate =0.04;		//명시적 초기화
	
	// 명시적초기화 > 인스턴스 초기화 블럭  > 생성자 초기화
	
	//생성자가 오버로딩 되어 있을 때 중복 코딩이 있다면 초기화 블럭 사용,
	// [ 인스턴스 초기화 블럭]
	{
		count++;
		serialNumber = count;
		System.out.println("> 인스턴스 초기화 블럭");
	}
	// [ 클래스 초기화 블럭 ]
	// 일과적으로 클래스 변수가 초기화하기 위한 목적으로 사용.
	static {
		rate = 0.07;
		System.out.println("클래스 초기화블럭");
		
	}
	//생성자
	Member(){
		count++;
		serialNumber = count;
		name = "무명";
		System.out.println(" > Member 디폴트 생성자 호출됨.");
		
	}
	//매서드
	Member(String name){
		count++;
		serialNumber = count;
		this.name = name;
		System.out.println(" Member 1 생성자 호출돰.");
		
	}
}














