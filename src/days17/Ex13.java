package days17;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 4:40:28
 * @subject
 * @content
 */
public class Ex13 {
	public static void main(String[] args) {
		//html 문서 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기.
		//또는
		// xml 문서를 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기.
		String fileName = "sample.xml";
		String docType = "xml";
		//업캐스팅
		Parseable parser = ParserManager.getParser(docType); // docType을 "xml"로 설정
		//다형성
		parser.parse(fileName);
		parser.print();
		
		System.out.println("end");
	}
}

// Parseable 인터페이스
interface Parseable {
	// 구문분석을 하는 추상 매서드 선언
	void parse(String fileName);

	// static 메서드 (JDK 1.8 이후 지원)
	static void test() {
		System.out.println("20년 지난 후에 이 기능 메서드 추가");
	}

	// default 메서드 (JDK 1.8 이후 지원)
	default void print() {
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}
}

// ParseablePlus 인터페이스
interface ParseablePlus extends Parseable {
	// 인쇄하는 추상 메서드 선언
	void print();
}

// HTML 문서 파서를 위한 클래스
class HTMLParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println("HTML 문서 파일을 구문 분석하는 메서드 호출됨..");
	}
}

// XML 문서 파서를 위한 클래스
class XMLParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println("XML 문서 파일을 구문 분석하는 메서드 호출됨..");
	}
}
// PDF 문서 파서를 위한 클래스
class PDFParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println("PDF 문서 파일을 구문 분석하는 메서드 호출됨..");
	}
}

// WORD 문서 파서를 위한 클래스
class WORDParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println("WORD 문서 파일을 구문 분석하는 메서드 호출됨..");
	}

	// print 메서드를 오버라이딩 (구현된 메서드)
	@Override
	public void print() {
		System.out.println("WORD 문서 인쇄 기능 추가");
	}
}

// ParserManager 클래스 - 문서 유형에 맞는 파서를 반환
class ParserManager {
	public static Parseable getParser(String docType) {
		Parseable parser = null;

		switch (docType) {
		case "xml":
			parser = new XMLParser();  // XML 파서 반환
			break;
		case "html":
			parser = new HTMLParser();  // HTML 파서 반환
			break;
		case "pdf":
			parser = new PDFParser();   // PDF 파서 반환
			break;
		case "word":
			parser = new WORDParser();  // WORD 파서 반환
			break;
		default:
			System.out.println("지원되지 않는 문서 형식입니다.");
			break;
		}
		return parser;
	}
}
