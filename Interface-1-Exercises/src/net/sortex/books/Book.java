package net.sortex.books;

public class Book implements Comparable<Book> {
    private String name;
    private String year;

    public Book(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    @Override
    public int compareTo(Book anotherBook) {
        return this.name.compareTo(anotherBook.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
