package days06;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오전 11:10:05
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		//1~10==5
//		int sum=0;
//		for (int i = 0; i <= 10; i++) {
//			if (i%2 !=0) {
//			System.out.println("%");
//			} //f
//			
//			System.out.printf("%d+",i);
//			sum +=i;
//		} // for i
//		System.out.printf("\b=%d\n",sum);
		
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2 !=0) continue;
			
			System.out.printf("%d",i);
			sum +=i;
		}
		System.out.printf("%nsum = %d\n",sum);
		
		
		
		
		
		
	}
}
 


