package B139;

import java.util.Date;

public class Users {
	
	private String name;
	private int memberId;
	private Location address;
	private String phoneNumber;
	private Date birthday;
	private String rank;
	private Date creationDate;
	private rentedBooks Book[];
	
	public Users() {
	}
	
	public void borrowBook(Book book) {
		return new Book();;
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
