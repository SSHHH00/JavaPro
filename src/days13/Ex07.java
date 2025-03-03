package days13;

public class Ex07 {

	public static void main(String[] args) {
		//청보처리 기사 실기
		int [][] m = new int[5][5];
		fiil(m);
	//	fillM01(m);
		fillM02(m);
		dispM(m);
		
	}

	private static void fiil(int[][] m) {
		for (int i = 0; i < m[i].length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=0;
			} //for
		} //for
		
	}

	private static void fillM02(int[][] m) {
	    /*
	       * i=0 j=01234
	       * i=1 j=01234
	       * i=2 j=01234
	       * i=3 j=01234
	       * i=4 j=01234
	       */
	      /* [1]
	      for (int i = 0, v = 25; i < m.length; i++) {           // 행크기          
	         for (int j = 0; j < m[i].length; j++, v--) {    // 열크기
	            // m[i][j]=v;
	            m[i][j] = (m.length*m[i].length) - ( m[i].length*i + j );
	         } // for j
	      } // for i
	      */
	      
	      // [2]
	      /* 0 0  4 4
	       * 0 1  4 3
	       * 0 2  4 2
	       * 0 3  4 1
	       * 0 4  4 0
	       * 
	       * 1 0  3 4
	       * 1 1  3 3
	       * 1 2  3 2
	       * 1 3  3 1
	       * 1 4  3 0 
	       * */ 
	      for (int i = 0; i < m.length; i++) {           // 행크기          
	         for (int j = 0; j < m[i].length; j++) {    // 열크기
	            m[4-i][4-j] = 5*i+j+1;
	         } // for j
	      } // for i
	   }

	private static void fillM01(int[][] m) {
	/*	for (int i = 0, v = 1 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5*i+j+1;
			} //for
			System.out.println();
		} //for
	*/	
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
