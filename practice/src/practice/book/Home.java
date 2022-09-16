package practice.book;

//...View와 ...Controller 사이에 연결해주는 클래스
public class Home {
	//연결대상1 : Controller
	private BookController bookController = BookController.getinstance();
	
	//연결대상2 : View 주입(inject)
	//bookStoreView
	private BookStoreView bookStoreView = BookStoreView.getinstance();
	
	//초기화 메서드
	public void initialize() {
		//view의 환영인사 처리 -> 8, 2, 0중 선택한 숫자를 받아와서
		//여기에 환영인사
		System.out.println(bookStoreView.init());
	}
	
	//home(8) -> number에는 8이 할당
	private void home(int number) {
		System.out.println("number: " + number);
		
	}
}