package days15;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오후 4:32:02
 * @subject			[ static 키워드 설명 ] p247~254
 * @content		
  			기업은행 : 이자율 동일한 보통예금(적금)
  			저축 관련된 클래스 선언	:	Save
 
 */
public class Ex07 {
	public static void main(String[] args) {
		//객체명.인스턴수 변수
		//객체명.인스턴스 매서드()
		
		//클래스명.클래스멤버(필드,매서드);
		//The field Save.rate is not visible
		//접근지정자 오류
		Save.setRate(0.08);
		System.out.println(Save.getRate());
		/*
		Save s1 = new Save("권태정",10000,0.04);
		Save s2 = new Save("김가은",23000,0.04);
		Save s3 = new Save("김도훈",23000,0.04);
		Save s4 = new Save("김민선",3300,0.04);
		Save s5 = new Save("김승효",100500,0.04);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		*/
		
		//클래스 배열 [ 2 ]
		/*
		Save [] sArr = new Save[5];
		sArr[0] = new Save("권태정",10000,0.04);         
		sArr[1] = new Save("김가은",23000,0.04);         
		sArr[2] = new Save("김도훈",23000,0.04);         
		sArr[3] = new Save("김민선",3300,0.04);          
		sArr[4] = new Save("김승효",100500,0.04);    
		*/
		
		// 클래스 배열 초기화
		//  [ 3 ]; 
		/*
		Save [] sArr = {
			new Save("권태정",10000,0.04), 
			new Save("김가은",23000,0.04), 
			new Save("김도훈",23000,0.04),
			new Save("김민선",3300,0.04),
			new Save("김승효",100500,0.04) 
		};
		for (Save s : sArr) {
			s.printSave();
		}
		*/
		
		
		
		
	}//main
}//class
