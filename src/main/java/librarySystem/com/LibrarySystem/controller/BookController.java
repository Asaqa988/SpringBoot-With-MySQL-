package librarySystem.com.LibrarySystem.controller;

import librarySystem.com.LibrarySystem.model.Book;
import librarySystem.com.LibrarySystem.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookServices bookServices;

    
    @Autowired


    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping("/{book_id}")
    public Book getBookById(@PathVariable("book_id") String bookId) {
        return bookServices.getBookById(bookId);
    }

    @PostMapping
    public String addNewBook(@RequestBody Book book) {
        return bookServices.createNewBook(book);
    }

    @PutMapping
    public String updateBookInformation(@RequestBody Book book) {
        return bookServices.updateExistedBook(book);
    }

    @DeleteMapping("/{book_id}")
    public String deleteBook(@PathVariable("book_id") String bookId) {
        return bookServices.deleteExistedBook(bookId);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookServices.getAllBooks();
    }

    @GetMapping("/search")
    public List<Book> getByBookName(@RequestParam("name") String bookName) {
        return bookServices.getByBookName(bookName);
    }
}
