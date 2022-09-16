package practice.book;

import java.sql.SQLException;
import java.util.List;

//고객의 요청을 여기서 수렴하여 Service(기능) 로직 수행
public class BookController {
	//싱글톤 객체 생성
	private static BookController instance = new BookController();
	private BookController() {}
	public static BookController getinstance() {
		return instance;
	}
	
	//BookService 객체 생성
	private BookService bookService = BookService.getinstance();
	
	//book테이블 select
	public List<BookVO> select() throws SQLException {
		return this.bookService.select();
		
	}
}
