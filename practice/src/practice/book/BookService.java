package practice.book;

import java.sql.SQLException;
import java.util.List;

//서비스 : 비즈니스로직(기능). Controller(요청 수령)에서 고객의 요청을 받아 service로 구현
public class BookService {
	//싱글톤 객체 생성
	private static BookService instance = new BookService();
	private BookService() {}
	public static BookService getinstance() {
		return instance;
	}
	
	//DAO객체 주입하여 service에서 dao 객체를 사용.
	private BookDAO bookDAO = BookDAO.getinstance();
	
	
	//book테이블 select
		public List<BookVO> select() throws SQLException {
			return bookDAO.select();
		}
}
