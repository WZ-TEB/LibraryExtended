package org.example;

import java.util.ArrayList;
import java.util.List;

public interface LibraryExtended {
    String addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    String addBook(String title, String[] authors);
    void removeBook(String bookId);
    void rentBookToClient(String bookId, String clientId);
    void returnBookToLibrary(String bookId);
    ArrayList<Book> findBooksByAuthor(String author);
    ArrayList<Client> findClientsByLastName(String lastName);
    ArrayList<Book> findBooksByTitle(String title);
    ArrayList<Book> getRentedBooksOfClient(String clientId);
    ArrayList<Book> getAvailableBooks();
}
