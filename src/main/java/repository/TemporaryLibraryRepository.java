package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.piotrdawidziuk.model.Author;
import pl.piotrdawidziuk.model.Book;
import pl.piotrdawidziuk.service.JSONReader;

@Component
public class TemporaryLibraryRepository implements LibraryRepository {
	private List<Book> books;
    private List<Author> authors;

    public TemporaryLibraryRepository(JSONReader jsonReader) {
        this.books = jsonReader.mapJsonToBookList();
        this.authors = jsonReader.mapJsonToAuthorListSortByAvgRatingDesc();
    }

    @Override
    public Book getBookByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }

        return null;
    }

    @Override
    public List<Book> getBooksByCategory(String categoryName) {
        List<Book> result = new ArrayList<>();

        books.forEach(book -> {
            List<String> categories = book.getCategories();
            if (categories != null && categories.contains(categoryName)) {
                result.add(book);
            }
        });
        return result;
    }

    @Override
    public List<Author> getAuthors() {
        return authors;
    }

}
