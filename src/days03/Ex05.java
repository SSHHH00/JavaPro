	package days03;



	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	/*
	 * 	표준입력장치
	 * 		[키보드] ->	 [System.in] -> 	InputStremReader	-> 		BufferdReader
	 * 					 
	 * 		String name - br.readline();	
	 */

	public class Ex05 {

		public static void main(String[] args) throws IOException {
			//	[문제] 키보드로 부터 이름을 입력받아서 출력.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Scanner 클래스
			String name = null;
			System.out.print("이름 : ");
			name = br.readLine();
			System.out.printf("> 이름 : %s", name);
			
			






	}//main

}//class
