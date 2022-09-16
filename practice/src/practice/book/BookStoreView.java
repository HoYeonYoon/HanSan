package practice.book;

import java.util.Scanner;

//View : 사용자가 보는 화면
public class BookStoreView {
	//싱글톤 패턴 객체 생성
	private static BookStoreView instance = new BookStoreView();
	private BookStoreView() {}
	public static BookStoreView getinstance() {
		return instance;
	}
	//스캐너 객체 생성
	private Scanner scanner = ScannerUtil.scanner();
	
	//환영인사
	public int init() {
		//맨 처음에 보여줌
		System.out.println("개똥이 북스토어에 오신 것을 환영합니다.");
		//HomeMenu 클래스로 처리
		System.out.println("8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택");
		//8, 2, 0 중 하나 선택
		return scanner.nextInt();
	}
	
	
	
	
	
	
	
}
