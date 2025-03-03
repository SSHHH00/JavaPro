package days14;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 20. - 오후 9:45:09
 * @subject
 * @content	달팽이 배열
 */
public class Ex01 {

	public static void main(String[] args) {
		int [][] m = new int[5][5];

		whelK(m);
		dispM(m);
	}

	private static void whelK(int[][] m) {
		int n = 5; // 수행 횟수
		int row = 0, col = -1; // 행, 열 인덱스 
		int v = 1; 
		int sw = 1;
		
		while(true) {
			// 행 고정     열증가 +1/열감소 -1  for문  (수행횟수)
			for (int i = 0; i < n; i++) {
				col+= sw; // -1
				System.out.printf("가로 %d,%d\n", row,col );
				m[row][col] = v++;
			} // for i    
			n--; // 수행횟수 1감소
			if( n == 0 ) break;
			// if( v == 26 ) break;
			// 열 고정   행증가 / 행감소  for문
			for (int i = 0; i < n; i++) {
				row+=sw; // row--;
				System.out.printf("세로 %d,%d\n", row,col );
				m[row][col] = v++;
			} // for i

			sw = -sw;

		} // while

	}

	private static void dispM(int[][] m) {
		System.out.println("   0열 1열 2열 3열 4열");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d행",i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%2d]",m[i][j]);
			} //for
			System.out.println();
		} //for
	}

}
