package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 11:39:57
 * @subject	
 * @content
 */
public class Ex03_03 {

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String name;
	byte kor, eng, mat;
	short tot;
	double avg;
	// 홍길동,90,78,97
	System.out.println("> 이름,국어,영어 ,수학입력  : ?");
	String data = br.readLine();
	
	String [] dataArr = data.split(",");
	name = dataArr[0];
	kor = Byte.parseByte(dataArr[1]);
	eng = Byte.parseByte(dataArr[2]);
	mat = Byte.parseByte(dataArr[3]);
	
	tot = (short) (kor+eng+mat);
	avg = tot /3;
	
	System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d, "
			+ "총점=%d,평균=%5.2f\n", name,kor,eng,mat,tot,avg);
	}

}



