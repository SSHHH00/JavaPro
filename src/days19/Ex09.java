package days19;

import java.awt.Point;
import java.util.Objects;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 5:08:06
 * @subject
 * @content			
 */
public class Ex09 {

	public static void main(String[] args) {
		//java.util.Arrays 클래스
		//java.util.Random 클래스
		
//		Random rnd = new Random();
		
	/*	System.out.println(rnd.nextBoolean());		//실생시 마다 true / false 값랜덤
		System.out.println(rnd.nextInt());			//-21djr~ 21djf
		System.out.println(rnd.nextInt(10));		//0<= int <10
	*/
		
		//java.util.Objects 클래스
		// 		ㄴ Object의 보조 클래스
		// 		ㄴ static 멤버
		Point p = null;
		if (p != null) {
			//
		}//if
		
		if( !Objects.isNull(p) ) {
			
		}
		if ( Objects.nonNull(p)) {
			
		} //if
		Point p2 = null;
		if (p != null && p.equals(p2)) {
			
		} //if
		if (Objects.equals(p,p2)) {
			
		} //if
		
		System.out.println(Objects.toString(p2, "NULL"));
		
	}//main

}//class














