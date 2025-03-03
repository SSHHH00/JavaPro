package days13;

/**
 * @author C_Seung_H0
 *		2차원 배열 초기화 설명
 */
public class Ex02_02 {

	public static void main(String[] args) {
		/*
		int [][] m= new int[2][4];		//2행 4열 int 2차원 배열
		m[0][0]=1;m[0][1]=2;m[0][2]=3;m[0][3]=4;
		m[1][0]=5;m[1][1]=6;m[1][2]=7;m[1][3]=4;
		*/
		
		
		
		//2차원 배열 초기화
		int [][] m = { {1,2,3,4,}, {5,6,7,8} };
		dispM(m);
		
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d",i,j,m[i][j]);
				
			} //for
		} //for
	}

}
