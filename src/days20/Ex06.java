package days20;

import java.util.Date;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 12:29:40
 * @subject
 * @content		DATE java.util. 과 java.sql. 혼동 사용 주의 import 확인
 * 
 				날짜(date)와 시간(time) 다루는 클래스
 				형식화 클래스
 
 				JCF? ( Java Collection FrameWork )
 				제네릭과 어너테이션
 				자바의 IO
 				람다식과 스트림
 				(스레드와 네트워크 [ 3 ]일)
 				팀프로젝트
 */
public class Ex06 {
	public static void main(String[] args) {
/*
 		1. jdk 1.0 - java.util.DAte 클래스
 		2. jdk 1.1 - java.util.Calender 클래스
 		3. jdk 1.8 - java.util.time 패키지 안에 여러 하위 패키지
 							ㄴ 다양한 날짜 / 시간 클래스 추가
 
 */
		Date d = new Date();
		
//		System.out.println(d);
		//28 Feb 2025 03:40:10 GMT 그리니치 표준시(평균시)
		System.out.println(d.toGMTString() );
//		System.out.println(d.toLocaleString());

		System.out.println(d.getYear() + 1900);		// 1900 +
		System.out.println(d.getMonth()+1);			// +1 월 출력
		System.out.println(d.getDate());			//일
		System.out.println(d.getMinutes());			//분
		System.out.println(d.getSeconds());			//초
		System.out.println(d.getTime());			//long 형값을 출력
		// 일(0) 월(1) 화(2) 수(3)~~
		//the number of milliseconds since January 1, 1970, 00:00:00 GMTrepresented by this date.
		//970년 1월 1일 00:00:00 GMT 이후의 밀리초(ms) 단위 시간
		
		System.out.println("일월화수목금토".charAt(d.getDay()));
//		해당 날짜의 요일을 0~6 숫자로 반환하는 메서드
		
		
		System.out.println(d.getTimezoneOffset());
		//Date 객체(d)의 현재 시간대(GMT/UTC 기준) 오프셋을 **"분 단위"**로 반환함.
		System.out.println(d.getClass());
		
		
		
		
		
		
//		Time t = new
		
	}
}




















