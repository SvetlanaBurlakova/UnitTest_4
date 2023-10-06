package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;


class BookServiceTest {
    @Test
    public void FindBookFromIDTest(){
        BookRepository bookRepository = mock(BookRepository.class);
        Book book = mock(Book.class);
        when(book.getId()).thenReturn("1");
        when(book.getAuthor()).thenReturn("Author1");
        when(book.getTitle()).thenReturn("Title1");
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById("1")).thenReturn(book);
        assertThat(bookService.findBookById("1")).isEqualTo(book);
        verify(bookService.findBookById("1"),times(1));

    }
    @Test
    public void FindAllBooks(){
        BookRepository bookRepository = mock(BookRepository.class);
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        when(bookRepository.findAll()).thenReturn(books);
        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.findAllBooks()).isEqualTo(books);
        verify(bookRepository,times(1)).findAll();
    }


}