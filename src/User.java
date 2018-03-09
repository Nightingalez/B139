package B139;

import java.util.Date;

public class User {
	
	private String name;
	private int memberId;
	private Location address;
	private String phoneNumber;
	private Date birthday;
	private String rank;
	private Date creationDate;
	private Book[] rentedBooks;
	
	public User() {
	}
	
	public void borrowBook(Book book) {
	}
	
	public void returnBook() {
	}
	
	public Book searchBook(String string)	{
		return new Book();
	}
	
	public void reserveBook(Book book)	{
	}
	
	public boolean statusBook(Book book) {
		return true;
	}
}
