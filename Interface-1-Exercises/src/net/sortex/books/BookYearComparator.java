package net.sortex.books;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {
        return bookOne.getYear()- bookTwo.getYear();
    }
}