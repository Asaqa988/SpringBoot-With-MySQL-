package librarySystem.com.LibrarySystem.service;

import librarySystem.com.LibrarySystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findByBookName(String bookName);
}
