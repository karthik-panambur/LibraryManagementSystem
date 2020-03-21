class inventoryManagement{
	
	public static void main(String[] args){
		Library lib = new Library();
		lib.addBooks(1,"abc",1);
		lib.addBooks(2,"abc",1);
		lib.addBooks(3,"xyz",2);

		System.out.println(lib.borrow_book("abc"));
		System.out.println(lib.checkStatus(1));	
		System.out.println(lib.borrow_book("abc"));
		System.out.println(lib.borrow_book("abc"));
		System.out.println(lib.borrow_book("xyz"));
		System.out.println(lib.return_book("abc",1));
		System.out.println(lib.borrow_book("abc"));
		System.out.println(lib.checkStatus(1));
	}
}