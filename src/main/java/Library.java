import java.util.*;

public class Library{

	List<Book> books;

	public Library(){
		this.books = new ArrayList<Book>();
	}

	public String borrow_book(String title){
		for(Book book : books){
			if(book.getTitle().equals(title) && !book.isBorrowed()){
				Random random = new Random();
				book.setBorrowed(random.nextInt(100));
				return book.getTitle();
			}
		}
		return "Book not available";
	}

	public boolean return_book(String title, int id){
		for(Book book : books){
			if(book.getId() == id && book.isBorrowed()){
				book.setReturn();
				return true;
			}
		}
		Random random = new Random();
		this.addBooks(id,title,random.nextInt(100));
		return true;
	}

	public void addBooks(int bookId, String bookTitle, int bookShelfId){
		Book bk = new Book(bookId,bookTitle,bookShelfId);
		this.books.add(bk);
	}

	public int checkStatus(int id){
		for(Book book : books){
			if(book.getId() == id && book.isBorrowed()){
				return book.getBorrowerId();
			}
			else if(book.getId() == id && !book.isBorrowed()){
				return book.getShelfId();
			}
		}
		return -1;
	}
}