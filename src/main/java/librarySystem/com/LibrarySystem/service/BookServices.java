package librarySystem.com.LibrarySystem.service;

import librarySystem.com.LibrarySystem.model.Book;

import java.util.List;

public interface BookServices {

    String createNewBook(Book book);
    String updateExistedBook(Book book);
    Book getBookById(String bookId);
    String deleteExistedBook(String bookId);
    List<Book> getAllBooks();
    List<Book> getByBookName(String bookName);
}
