package days05;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오후 2:28:00
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		//[while]
		// 1~10 55
		
		//Type mismatch: cannot convert from int to boolean
		int i = 1, sum = 0;
		
		while ( true) {	
			if( i==55)	break;			//무한루프
			System.out.println( "%d+");
			sum += i;
			i++;
			
		}System.out.printf("=%d+\n",sum,i);
		
		
		
		
		
		
		
		

	}//main

}//class
 


