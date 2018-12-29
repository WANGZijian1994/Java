package myClassTest;

public class Book {
    public String getNameOfBook() {
		return nameOfBook;
	}
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getBOOKID() {
		return BOOKID;
	}
	public Book() {
		super();
	}
	public Book(String nameOfBook, String edition) {
		super();
		this.nameOfBook = nameOfBook;
		this.edition = edition;
	}
	private String nameOfBook;
    private final int BOOKID=13657;
    private String edition;
}
