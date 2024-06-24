package librarySystem.com.LibrarySystem.service;

import librarySystem.com.LibrarySystem.model.Book;
//import librarySystem.com.LibrarySystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicesImpl implements BookServices {

    private final BookRepository bookRepository;

    @Autowired
    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String createNewBook(Book book) {
        bookRepository.save(book);

        return "Book has been created";
    }

    @Override
    public String updateExistedBook(Book book) {
        bookRepository.save(book);
        return "Book has been updated";
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    @Override
    public String deleteExistedBook(String bookId) {
        bookRepository.deleteById(bookId);
        return "Book has been deleted";
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getByBookName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }
}
