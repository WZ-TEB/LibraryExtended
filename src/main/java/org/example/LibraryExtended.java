package org.example;

import java.util.List;

public interface LibraryExtended {
    String addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    String addBook(String title, String[] authors);
    void removeBook(String bookId);
    void rentBookToClient(String clientId, String bookId);
    List<Book> findBooksByAuthor(String author);
    List<Client> findClientsByLastName(String lastName);
    List<Book> findBooksByTitle(String title);
    List<Book> getRentedBooksOfClient(String clientId);
    List<Book> getAvailableBooks();
}
