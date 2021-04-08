package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("AAA BBB","CCC", 2003,"1111");
        Book book2 = new Book("DDD EEE","FFF", 2004,"2222");
        Book book3 = new Book("GGG HHH","III", 2008,"3333");
        Book book4 = new Book("JJJ KKK","LLL", 1998,"4444");
        Book book5 = new Book("MMM NNN","OOO", 1994,"5555");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYearOfPublication = medianAdapter.publicationYearMedian(books);
        // Then

        assertEquals(2003, medianYearOfPublication);
    }

}
