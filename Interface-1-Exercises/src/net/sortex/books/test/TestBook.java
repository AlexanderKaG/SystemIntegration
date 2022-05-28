package net.sortex.books.test;

import net.sortex.books.Book;
import net.sortex.books.BookYearComparator;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Harry Potter", "2000"),
                new Book("Programming", "2019"),
                new Book("Databases", "2020"),
                new Book("Systems integration", "2022"),
        };
        System.out.println(Arrays.toString(books));
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
