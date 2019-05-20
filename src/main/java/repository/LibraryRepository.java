package repository;

import java.util.List;

import pl.piotrdawidziuk.model.Author;
import pl.piotrdawidziuk.model.Book;


public interface LibraryRepository {
	
	 Book getBookByIsbn(String isbn);

	    List<Book> getBooksByCategory(String categoryName);

	    List<Author> getAuthors();

}
