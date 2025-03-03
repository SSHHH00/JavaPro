package days15;

//처축과 관련된 클래스
public class Save {

		//필드
		//인스턴스 변수(필드)
	private String name;		//예금주
	private int money;			//예금액
	// 클래스(static) 변수 또는 필드, 공유변수 (shared ),정적(static)변수
	private static double rate = 0.04;	//이자율
	
		//생성자
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
		//매서드
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
	            ,this.name, this.money, this.rate);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//static 매서드
	//정적 매서드
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		//Cannot use this in a static context
		Save.rate = rate;		//staric 안에 this 사용 x 문법오류
		//rate = rate;
	}
	
	
	
}
