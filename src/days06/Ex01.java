package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("배열입력 : ");
		int putNum = sc.nextInt();
		
		int lotto[] = new int[putNum];
		int index =0;
		
		while (index < putNum) {
			int n = (int)(Math.random()*45)+1;
			
			boolean isDuplicate =false;
			
			for (int i = 0; i < index; i++) {
				if(lotto[i] ==n) {
					isDuplicate = true;
					break; // F3을 누르면 해당 반복문에 시작을 알 수 있음.
				}
			} // for i
			if (!isDuplicate) {
				lotto[index++] = n;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}//main
	
}//class