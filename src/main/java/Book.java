public class Book{
	private int bookId;
	private String bookTitle;
	private boolean borrowed;
	private int borrowId;
	private int bookShelfId;
	
	public Book(int bookId, String bookTitle, int bookShelfId){
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.borrowed = false;
		this.borrowId = -1;
		this.bookShelfId = bookShelfId;
	}

	public void setBorrowed(int borrowId){
		this.borrowed = true;
		this.borrowId = borrowId;
	}

	public boolean isBorrowed(){
		return this.borrowed;
	}

	public String getTitle(){
		return this.bookTitle;
	}

	public void setReturn(){
		this.borrowed = false;
	}

	public int getId(){
		return this.bookId;
	}

	public int getBorrowerId(){
		return this.borrowId;
	}

	public int getShelfId(){
		return this.bookShelfId;
	}
}