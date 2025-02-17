package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오전 11:04:29
 * @subject 임시 저장공간 만들기
 * @content
 * 
 */
	public class Ex03 {

		public static void main(String[] args) {
		// [시험] 두 기억공간의 값을 바꾸기
		int x = 10, y =20;
//		System.out.printf(">x=%d, y=%d\n", x, y);
//		y = x;
//		x = y;
		
		System.out.printf(">x=%d, y=%d\n", x, y);		
//		
		//임시저장공간만들기	x -> y
//						y -> x	temp라는 값을 이용.(기억공간을 사라지기위함
		
		{
			int temp = x;		//10
			x = y;				//20
			y = temp;			//10	//temp만. 사용하기 위해 지역변수를 따로만든 상태
		}
		
		
		System.out.printf("> x=%d , y=%d \n", x, y);
		
		int x2 =20, y2=40;
		{
			int temp = x2;
			x2= y2;
			y2 = temp;
			
		}
		
		System.out.printf("> x2=%d , y2= %d \n",x2,y2);
		
	}

}
