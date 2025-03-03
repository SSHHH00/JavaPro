package days14;

//default(package) 패키지 내부에서만 사용(상,참) 가능하다.
public class Person {
		
	// 필드
	public String name;
	public int age;
	
	
	// 매서드
	public void work() {
		System.out.println(name + "이/가 일한다");
	}
	public void run() {
		System.out.println(name + "사람이 달리다");
	}
}
