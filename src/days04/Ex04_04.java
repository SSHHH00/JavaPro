package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 1:36:20
 * @subject
 * @content
 */
	public class Ex04_04 {

		public static void main(String[] args) {
		 // 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
	      // (출력형식)
	      // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
//		String name = null;
//		byte age = 0;
//		double cm = 0;
//		byte gender = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("이름 :");
//		name = sc.next();
//		
//		System.out.printf("나이");
//		age = sc.nextByte();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이입력 :");
//		age = sc.nextByte();
//		System.out.println("나이 : " age);
//		
		String name;
		byte age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 나이 키 성별 입력 ?");
		
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		System.out.printf("이름 : %s, 나이:%d살,  키%.2f, 성별:%b\n",
				name , age , height , gender);
				
			
		
		
	}

}
 


