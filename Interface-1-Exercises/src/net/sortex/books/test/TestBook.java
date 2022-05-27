package net.sortex.books.test;

import net.sortex.books.Book;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Harry Potter"),
                new Book("Programming"),
                new Book("Databases"),
                new Book("Systems integration")
        };
        
        Arrays.sort(books);
    }
}
