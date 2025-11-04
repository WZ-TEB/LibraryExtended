package org.example;

import java.util.UUID;

public class Book {
    private String title;
    private String[] authors;
    private String bookId;

    public Book(String title, String[] authors) {
        this.title = title;
        this.authors = authors;
        this.bookId = UUID.randomUUID().toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
