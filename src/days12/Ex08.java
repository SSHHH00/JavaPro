package days12;

public class Ex08 {

	public static void main(String[] args) {
		// 1차월 배열
	/*	int [] m = new int[8];
		System.out.println(m.length);
		dispM(m);
	*/	
		//2차원 배열
		int [][] m = new int[4][3];
		System.out.println(m.length);		//행의크기
		System.out.println(m[0].length);	// 0 행의 열크기
		System.out.println(m[1].length);	//
		System.out.println(m[2].length);
		System.out.println(m[3].length);
		
		dispM(m);
		
	/*	m[0]        m[1]    m[2] m[3]
			      [0x200][0x300][][]                                   [0x100주소]
			      0x100                                           m 
			      [4바이트][4바이트][4바이트]
			      0x200 
			      [4바이트][4바이트][4바이트]
			      0x300
	 */
	}//main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d",i,j,m[i][j]);
			} //for
			System.out.println();
		} //for
	}
	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d",i,m[i]);
		} //for
		System.out.println();
	}

}//class
