package net.sortex.books;

public class Book implements Comparable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object anotherBook) {
        return 0;
    }
}
