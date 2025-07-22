/*
 * 일반 프로그램 (프로그램 - 우영체제 - 하드웨어)
 * 자바 프로그램 (프로그램 - JVM(jdk) - 운영체제 - 하드웨어) => 실제 실행속도가 느림
 * -----------------
 * JDK
 * -------
 * JRE    --------
 * ------  Developer Tool
 * JVM    --------
 * -----     Development Library
 * Library  ------
 * -------
 * 
 * 1. Developer Tool
 * javac : 컴퓨터 인식 언어로 변경 (컴파일)
 * java : 프로그램 실행 (인터프리터 => 한 줄 씩 읽어서 출력)
 * javap : 역컴파일러 => 자바로 원상 복귀
 * javah : header 파일 읽기 => c/c++ 연동
 * javaw : 서버 구동
 * jar : 인증, 배포
 * 		웹 : war (maven), 자바 : jar (gradle) :zip => tar
 * 
 * 2. JRE : 라이브러리를 포함하고 있다
 * ----------------------------------
 * 
 * 동작 방식
 * A.java ===javac===> A.class ===java===> 화면 실행
 * 프로그램     컴파일       배포     인터프리터
 * 배포는 .class 파일 => war/jar (모든 운영체제에서 동일한 파일을 생성 => 운영체제 호환성 좋음)
 * 
 * c/c++ 컴파일 내용이 틀리므로 해당 운영체제에서 컴파일을 다시 한다
 * 
 * 자바의 특징
 *  = 모든 운영체제에서 같은 소스로 사용이 가능
 *  = 객체지향 프로그램 (조립식)
 *  = 메모리 자동 정리 : 스택영역 (메모리 처리)
 *  = 라이브러리가 풍부
 *  ----------------------------------
 *  src
 *   |- .java => 클래스명과 동일한 파일명
 *      한 파일 안에 여러개의 클래스 제작이 가능
 *      -> class a
 *         class b -> a.java / b.java
 *      -> class a
 *         public class b -> b.java
 * 
 * 규칙 (약속)
 * 1. 클래스명 : 대문자 시작
 * 			   MainClass
 * 			   - 두번째 단어 시작 대문자 시작
 * 			   - _Main : 임시 파일
 * 2. 메소드명 (기능 처리) , 변수명 (메모리에 데이터 저장) : 소문자
 * 3. 인터페이스 (다른 클래스 연결) : 대문자
 */
public class 자바정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
