package days17;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 3:16:55
 * @subject
 * @content
 */
public class Ex11 {
	public static void main(String[] args) {

		/*
		 	[ 인터페이스의 장점 ] 
		 1. 개발 시간을 단축
		 2. 표준화가 가능
		 3. 서로 관련 없는 클래스 들에게 관계를 맺어 줄수도 있다
		 4. 독립적인 프로그래밍이 가능하다.
		 5.
		 
		 */
		//			인터페이스 선언 CRUD 작업
		//예시 ) 프로젝트 개발 DBS : Oracle
		//다음		"			 : MYSQL Server
		//다음 		"			 : MYSQL
		
		//다형성 / 인터페이스 참조 (업캐스팅 가능)
		//IDBConn conn =  new OracleDriver();	
		IDBConn conn =  new MySQLDriver();
				
		conn.open();		//DB 연결하는 매서드
		
		conn.insert();
		
		conn.close();
	}//main
}//classssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss













