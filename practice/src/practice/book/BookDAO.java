package practice.book;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//DAO(Data Access Object) : 라클아 데이터 다오
//Service와 DB 사이에서 데이터를 전달(VO에 담아서..)
public class BookDAO {
   //싱글톤(메모리에 한 번 생성하여 공유하여 사용) 객체 생성
   private static BookDAO instance = new BookDAO();
   private BookDAO() {}
   public  static BookDAO getInstance() {
      return instance;
   }
      
   //Jdbc : Java Database Connectivity 템플릿을 사용해보자
   private JdbcTemplate template = BookStoreApplication.getTemplate();
   
   //Book테이블에 데이터를 select
   /*
    SELECT BOOK_ID, BOOK_NAME, PUBLISHER, PRICE 
    FROM   BOOK
    ORDER BY BOOK_ID
    */
   //book테이블 select   
   public List<BookVO> select() throws SQLException {
      String query = "SELECT BOOK_ID, BOOK_NAME, PUBLISHER, PRICE "
            + " FROM   BOOK"
            + " ORDER BY BOOK_ID";
      //쿼리를 실행해줌
      return template.query(query, new BeanPropertyRowMapper<>(BookVO.class));
   }
}



