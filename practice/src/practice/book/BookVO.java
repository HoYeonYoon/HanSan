package practice.book;
//자바빈(bean) 클래스
public class BookVO {
	//vO들이 모이면 list가 된다
	//필드 = 멤버변수
	private int bookId;
	private String bookName;
	private String publisher;
	private int price;
	
	//기본생성자
	public BookVO() {
	}

	//getter/setter 메소드
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", bookName=" + bookName + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}
}