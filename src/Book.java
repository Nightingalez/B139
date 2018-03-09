package B139;

public class Book {
	private int id;
	private int pageNumber;
	private String title;
	private String isbn;
	private String auther;
	private String publishingYear;
	private String genre;
	private User renter;

	public Book() {

	}

	public boolean isRented() {
		return true;
	}

}
