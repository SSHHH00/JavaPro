package days14;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 20. - 오후 9:43:27
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 클래스 복사(copy)
		
		
		// 클래스 복제(clone)	  - 얇은 복제 / 깊은 복제
		
		/*	인스턴스											객체
		 	[color] [power] [ channel]	[][][]				[0x100]
		 	0x100												t1
		 	
		 	인스턴스											객체
		 	[color] [power] [ channel]	[][][]				[0x200]
		 	0x200												t2
		 	
		 								[power()][channelUp()][channelDown()]
		 								
		 */
		Tv t1 = new Tv();
		
		//클래스(객체) 복제
		Tv t2 = new Tv();
		t2.channel = t1.channel;
		t2.power = t2.power;				
		t2.channel = t2.channel;
		
		Tv t3 = t1;				//객체만 복사
		
		
		t1.color = "red";
		System.out.println(t1.color);
		System.out.println(t3.color);
		
		objectCopy(t1);
		System.out.println(t1.color);
		

	}

	private static void objectCopy(Tv t1) {
		t1.color = "blue";
	}

}
