package objects0303;

public class Book {
	// 필드
	private String bookName;
	private String writer;
	private String company;
	private int value;

	// 생성자
	public Book(String bookName, String writer, String company, int value) {
		this.bookName = bookName;
		this.writer = writer;
		this.company = company;
		this.value = value;
	}

	// get/set 메소드
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
