package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given

        Library library = new Library("my library");
        Book book1 = new Book("Dune", "Frank Herbert", LocalDate.of(1965,12, 1));
        Book book2 = new Book("Harry Potter", "J.K. Rowling", LocalDate.of(1997,11,19));
        Book book3 = new Book("Hobbit", " J.R.R.  Tolkien", LocalDate.of(1937, 1,31));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("my library - first copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my library - second copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);


        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
