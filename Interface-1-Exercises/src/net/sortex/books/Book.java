package net.sortex.books;

public class Book implements Comparable {
    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object anotherBook) {
        return 0;
    }

    @Override
    public String toString() {
        return getName() + " " + this.year;
    }
}
