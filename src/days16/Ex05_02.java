package days16;import java.util.DuplicateFormatFlagsException;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오전 11:45:42
 * @subject
 * @content	
 	클래스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화블럭
 	인스턴스 변수의 초기화순서: 기본값 -> 명시적 초기화 -> 인스턴스 초기화블럭->생성자
 				
 */
public class Ex05_02 {

	public static void main(String[] args) {

		//공장에서 제품을 생산할때 제품마다 생산일련번호(serial no)를 부여..
		//인스턴스 마다 고유한 일련번호를 부여
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서,txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
		
	}//main

}//classsssssssssssssssssssssssssssx

class Document{
	String filename;
	static int count = 1;
	
	//인스턴스 초기화 블럭
	{
		count++;
	}
	public  Document() {
		//count ++;
		this( String.format("Noname%d", count));
	}
	public  Document(String filename) {
	//	count ++;
		this.filename= filename;
		System.out.printf("문서 \"%s\"가 생성되었습니다. \n",this.filename);
	}
	
	
	
}