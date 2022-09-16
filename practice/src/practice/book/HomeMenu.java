package practice.book;
//8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택
public class HomeMenu {
	//8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택
	//HOME(menu   , menuString)
	//HOME(메뉴번호, 메뉴내용)
	HOME(-1,"8.로그인\\t2.회원가입\\t0.프로그램 종료\\n메뉴선택");
	QUIT(0,"프로그램을 종료합니다.\n감사합니다.");
	
	private final int menu;
	private final String menuString;
	
	//생성자
	//int menu, String menuString : 매개변수
	HomeMenu(int menu, String menuString){
		//멤버변수 = 매개변수
		this.menu = menu;
		this.menuString = menuString;
	}

	public int getMenu() {
		return menu;
	}

	public String getMenuString() {
		return menuString;
	}
	
	//menu를 파라미터로 받으면 해당 menuString을 리턴
	public static HomeMenu findMenu(int menu) {
		//
		
	}
	
}