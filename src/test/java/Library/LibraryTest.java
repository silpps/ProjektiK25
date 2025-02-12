package Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addBook() {
        Library library = new Library();
        library.addBook("Kirja1");
        assertEquals("Kirja1", library.getBook(0));
    }

    @Test
    void removeBook() {
        Library library = new Library();
        library.addBook("Kirja1");
        library.removeBook("Kirja1");
        assertEquals(0, library.size());
    }

    @Test
    void listBooks() {
        Library library = new Library();
        library.addBook("Kirja1");
        library.addBook("Kirja2");
        library.listBooks();
        assertTrue(library.books.contains("Kirja1"));
        assertTrue(library.books.contains("Kirja2"));
        assertEquals(2, library.size());
    }
}