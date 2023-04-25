package bookStore;

public class bookStore {
	public static void main(String[] args) {

		// Book
		Book book1 = new Book();
		book1.id = 1;
		book1.name = "Tieng Viet Vo Long";
		book1.ISBN = "xyz001";
		book1.author = "Lac Long Quan";
		book1.totalStock = 2000;

		Book book2 = new Book();
		book2.id = 2;
		book2.name = "An gi?";
		book2.ISBN = "abc002";
		book2.author = "Huan Hoa Hong";
		book2.totalStock = 5000;

		Book book3 = new Book();
		book3.id = 3;
		book3.name = "Con cai gi?";
		book3.ISBN = "def003";
		book3.author = "Nguyen Thanh Long";
		book3.totalStock = 2500;

		Book[] books = { book1, book2, book3 };

		// Genre
		Genre genre1 = new Genre();
		genre1.id = 1;
		genre1.name = "Social Philosophy";

		Genre genre2 = new Genre();
		genre2.id = 2;
		genre2.name = "Education";

		Genre[] genres = { genre1, genre2 };

		// Customer
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.name = "Nam";

		Customer customer2 = new Customer();
		customer2.id = 2;
		customer2.name = "Trung ";

		Customer customer3 = new Customer();
		customer3.id = 3;
		customer3.name = "Hung";

		Customer[] customers = { customer1, customer2, customer3 };

		// Location
		Location location1 = new Location();
		location1.id = 1;
		location1.name = "Hanoi";

		// BookStatus

		BookStatus tvVoLong1 = new BookStatus();
		tvVoLong1.book = book1;
		tvVoLong1.customer = customer3;
		tvVoLong1.borrowStatus = "In stock";
		tvVoLong1.returnStatus = "In stock";
		tvVoLong1.returnyet = true;

		BookStatus anGi1 = new BookStatus();
		anGi1.book = book2;
		anGi1.customer = customer1;
		anGi1.borrowStatus = "20/04/2023";
		anGi1.returnStatus = "27/04/2023";
		anGi1.returnyet = true;

		BookStatus anGi2 = new BookStatus();
		anGi2.book = book2;
		anGi2.customer = customer3;
		anGi2.borrowStatus = "28/04/2023";
		anGi2.returnStatus = "Not Yet";
		anGi2.returnyet = false;

		BookStatus conCaiGi1 = new BookStatus();
		conCaiGi1.book = book3;
		conCaiGi1.customer = customer2;
		conCaiGi1.borrowStatus = "22/04/2023";
		conCaiGi1.returnStatus = "26/04/2023";
		conCaiGi1.returnyet = true;

		BookStatus[] bookstatuses = { tvVoLong1, anGi1, anGi2, conCaiGi1 };

//		System.out.println("Book Status");
//		System.out.println();
//		for (BookStatus bookstatus : bookstatuses) {
//			if (bookstatus.returnyet == true) {
//				System.out.println("Book name: " + bookstatus.book.name);
//				System.out.println("Borrowed by: " + bookstatus.borrowStatus + "_____" + "Returned by: " + bookstatus.returnStatus);
//				System.out.println("--------------------------------------");
//			} else {
//				System.out.println("Book name: " + bookstatus.book.name);
//				System.out.println("Borrowed by: " + bookstatus.borrowStatus);
//				System.out.println("--------------------------------------");
//			}
//
//		}

		System.out.println("Borrow List");
		System.out.println();
		for (BookStatus bookstatus : bookstatuses) {
			if (bookstatus.returnyet == false) {
				System.out.println("Book name: " + bookstatus.book.name + "  -----  Customer:" +bookstatus.customer.name );
				System.out.println("Borrowed by: " + bookstatus.borrowStatus);
			}
		
		
			}
		
		
	}
}
