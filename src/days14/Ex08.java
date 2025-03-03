package days14;

/**
 * @author C_Seung_H0
 *			클래스 (객체) 배열
 *				ㄴ배열?
 */			
public class Ex08 {
	public static void main(String[] args) {
		//클래스 배열 선언 *******************
		//[배열 선언 형식]
		//자료형 [] 배열명 = new 자료형[배열크기];
		
		Person [] pArr = new Person[5];
		
		//5명의 사람(Person)
		Person p1 = new Person();
		p1.name = "권태정";
		Person p2 = new Person();
		p2.name = "김가은";
		Person p3 = new Person();
		p3.name = "김도훈";
		Person p4 = new Person();
		p4.name = "김민선";
		Person p5 = new Person();
		p5.name = "김승효";
		
		p1.work();
		p2.work();
		p3.work();
		p4.work();
		p5.work();
	}
}
