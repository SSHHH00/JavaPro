package days14;

/**
 * @author C_Seung_H0
 *		마방진 magic square
 *
 */
public class Ex01_02 {

	public static void main(String[] args) throws InterruptedException {
		int [][] m = new int[5][5];      
		// 골뱅이
		magicSquare(m);
		// 마방진      
		dispM(m);

		}//main
	private static void magicSquare(int[][] m) throws InterruptedException {
		/*
		int n = 3; // 수행 횟수
		int row = 0, col = -1; // 행, 열 인덱스 
		int v = 1; 
		int sw = 1;
		for (int i = 0; i < m.length; i++) {
			
		} //for
		*/	
		// 1숫자의 위치
		int v = 1;
		int row, col;
		int nextRow,nextCol;
		row = 0;				//첫번쩨 헹
		col = m[0].length/2;	//가운데 열
		m[row][col] = 1;
		
		while (v<=m.length*m[0].length) {
			Thread.sleep(1000);
			dispM(m);
			// 1. 열 증가 . 행 감소 
			nextCol = col + 1;
			nextRow = row - 1;
			// 2. 행 벗어난 경우	row =0	감소 row=-1
			if (nextRow == -1) nextRow = m.length-1;
			// 3. 열 벗어난 경우
			if (nextCol == m[0].length) nextCol =0;
			// 4. 그 다음 위치에 값이 있는 경우
			if (m[nextRow][nextCol] !=0) {
				nextRow = row +1;
				nextCol = col;
			}
			
		} //while
	}

		private static void dispM(int[][] m) {
			System.out.println("     0열 1열 2열 3열 4열");       
			for (int i = 0; i < m.length; i++) {           // 행크기
				System.out.printf("%d행 " , i);
				for (int j = 0; j < m[i].length; j++) {    // 열크기
					System.out.printf("[%2d]", m[i][j]);
				} // for j
				System.out.println(); // 개행
			} // for i
		}

}//class

