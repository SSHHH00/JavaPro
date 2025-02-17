package zhome;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 5:43:41
 * @subject
 * @content			구구단 가로출력 [3단출력 제외]
 */
public class 테스트2월12_01 {

	public static void main(String[] args) {
		int d = 2, i = 1;
		System.out.println("-".repeat(54));
	    while (d<=9) {
	    	if( d==3) {
				d++;
				continue;
			}
	    	System.out.printf(" [%d단]\t", d);
			d++;
		} // while
	    System.out.println();
	    System.out.println("-".repeat(54));
		while (i<=9) {
			d = 2;
			while (d<=9) {
				if( d==3) {
					d++;
					continue;
				}
				System.out.printf("%d*%d=%2d\t", d, i, d*i);
				d++;
			} // while
			System.out.println();
			i++;
		} // while d
		System.out.println("-".repeat(54));

	}

}
 


