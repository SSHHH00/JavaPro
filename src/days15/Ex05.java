package days15;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오후 2:04:14
 * @subject	[private로 필드를 선언한 후 필드에 접근하는 방법]
 * @content		ㄴ getter setter
  
  					Person 클래스를 새로 선언..
  					private int 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Person p1 = new Person( true );
		
		// 해결 : private -> package : 같은 패키지 내부에서만 참조 가능
		p1.name = "홍길동";
		//p1.age = 20; X
		p1.setAge(20);
		System.out.println(p1.getAge());
		//나이를 키보드로 부터 얻어와서 입력..
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> 나이입력 : ?");
		int age = sc.nextInt();		//
		
		/*
		if (age >= 0 && age <= 120) {
			
			
		} else {
				
		}
		*/
		p1.setAge(age);
		
		p1.setGender(false); // 성별 쓰기 가능,읽기 XX
		
		System.out.println();
		System.out.println(" End");
		sc.close();
		
		
	}

}
