package Tdd;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	 public Library() {
	        books = new ArrayList<>();
	    }

	
		


	 public Book searchBookByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equals(title)) {
	                // Si le livre existe
	                System.out.println("Livre trouvé: " + book.getTitle());
	                return book;  // Retourner le livre trouvé
	            } else {
	                // Si ce livre ne correspond pas au titre recherché
	                System.out.println("Livre non trouvé pour le titre: " + title);
	            }
	        }
	        
	           return null;  
	    }

	public void addBook(Book book) {
		books.add(book);
		
	}
		
	}


