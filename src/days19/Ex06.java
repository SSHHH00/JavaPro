package days19;

import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * 
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 3:39:11
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// [ 2 ]
		// 문제) 소수점 3자리에서 반올림한 결과를 출력
		double d = 3.141592;
		//Math.round() 무조건 소수점 1자리에서ㅏ 반올림.
//		d = round( d * 100 )/100D;	//314/100
//		System.out.println( d );
		
		// [ 2 _ 2 ]
		d= Double.parseDouble(String.format("%.2f", d));
		System.out.println(d);
		
		// [ 1] 
		// Math 클래스 
/*		out.println( PI );
		out.println( E );
		
		out.println( random() );
		out.println( max(1,2) );
		out.println( min(1,2) );
		
		out.println( pow(2,3) );
		out.println( abs(-2) );
		out.println( sqrt(4) );
		
		//암기
		out.println( ceil(45.179 ));	//46.0 double 소수점 1 자리 올림(절상)
		out.println( ceil(45.979 ));	//46.0 double 소수점 1 자리 올림(절상)
		
		out.println( floor(45.979 ));	//45.0 doouble 소수점
		out.println( floor(45.979 ));	//45.0 doouble 소수점
*/		
		
		
		
		
	}

}
