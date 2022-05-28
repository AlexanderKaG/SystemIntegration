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
                new Book("Systems integration", "2022")
        };

        System.out.print("Unsorted: ");
        System.out.println(Arrays.toString(books));
        Arrays.sort(books); // default sort
        System.out.print("Default sorted (title): ");
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new BookYearComparator()); // using a comparator
        System.out.print("Sorted on year: ");
        System.out.println(Arrays.toString(books));
    }
}
