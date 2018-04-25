package Driver;

import lab5.BookStore;
import lab5.Book;
import lab5.Biography;
import lab5.Name;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore store= new BookStore();
		System.out.println("Creating a book(achieved)");
		
		try {
			store.addBook(new Name("J.R.R."), new Name("Tolkien"), "The Lord of the Ring" , 1968);
			store.addBook(new Name("Miguel de"), new Name("Cervantes"), "The Lord of the Ring" , 1968);	
			store.addBook(new Name("Hernan"), new Name("Melville"), "Moby Dick" , 1851);
			store.addBook(new Name("William"), new Name("Shakspeare"), "Hamlet" , 1601);
			store.addBook(new Name("Fredric"), new Name("Backman"), "Beartown: A Novel" , 2017);
		}
		catch (Exception e) {
			
			System.out.println("Error: "+e.getMessage());
		}
		System.out.println("Creating a book(failure by date");
	
		try {
			store.addBook(new Name("John"),new Name("Johnson"),"A tale from future",2019);
		}
	catch(Exception e){
		System.out.println("Error: "+e.getMessage());
	}
		System.out.println("Creating a book(failure by empty name)");
	
	
	
	try {
		store.addBook(new Name(""),new Name(""),"Anonymous Book",2019);
	}
catch(Exception e){
	System.out.println("Error: "+e.getMessage());
}
	System.out.println("Creating a book(failure by date)");
	
	
	
	try {
		store.addBook(new Name("Unknown"),new Name("Author"),"",2019);
	}
catch(Exception e){
	System.out.println("Error: "+e.getMessage());
}
	System.out.println("Creating a book(failure by null title)");
	
	
	try {
		store.addBook(new Name("Unknown"),new Name("Author"),null,2019);
	}
catch(Exception e){
	System.out.println("Error: "+e.getMessage());
}
	System.out.println("Creating a biography(success)");
	
	try {
		Book book0= new Biography(new Name("karen"),new Name("blumenthal"),"Steve Jobs: The Man Who Tought Different",2012,"Steve Jobs");
		store.addBook(book0);
		Book book1= new Biography(new Name("Walter"),new Name("Isaacson"),"The genious biographies: Steve Jobs",2011,"Steve Jobs");
		store.addBook(book1);
		
		System.out.println("Comparing Biographies");
		System.out.println(book0);
		System.out.println(book1);
		System.out.println("Result: "+book0.equals(book1));
		
	}
	catch(Exception e){
		System.out.println("Error: "+e.getMessage());
	}
		
	}
}
	
