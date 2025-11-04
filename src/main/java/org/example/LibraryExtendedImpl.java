package org.example;

import java.util.*;

public class LibraryExtendedImpl implements LibraryExtended {

    HashMap<String, Book> books = new HashMap<>();
    HashMap<String, Client> clients = new HashMap<>();
    HashMap<String, String> rentedBooks = new HashMap<>();

    @Override
    public String addClient(String firstName, String lastName, String email) {
        String clientId = UUID.randomUUID().toString();
        Client client = new Client(firstName, lastName, email);
        client.setClientId(clientId);
        clients.put(clientId, client);
        return clientId;
    }

    @Override
    public void removeClient(String clientId) {
        clients.remove(clientId);
    }

    @Override
    public String addBook(String title, String[] authors) {
        String bookId = UUID.randomUUID().toString();
        Book book = new Book(title, authors);
        book.setBookId(bookId);
        books.put(bookId, book);
        return bookId;
    }

    @Override
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    @Override
    public void rentBookToClient(String bookId, String clientId) {
        rentedBooks.put(bookId, clientId);
    }

    @Override
    public void returnBookToLibrary(String bookId) {
        rentedBooks.remove(bookId);
    }

    @Override
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books.values()){
            if (Arrays.asList(book.getAuthors()).contains(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public ArrayList<Client> findClientsByLastName(String lastName) {
        ArrayList<Client> foundClients = new ArrayList<>();
        for (Client client : clients.values()){
            if (client.getLastName().equals(lastName)){
                foundClients.add(client);
            }
        }
        return foundClients;
    }

    @Override
    public ArrayList<Book> findBooksByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books.values()){
            if (book.getTitle().equals(title)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public ArrayList<Book> getRentedBooksOfClient(String clientId) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Map.Entry<String, String> entry : rentedBooks.entrySet()){
            if (entry.getValue().equals(clientId)){
                String foundBookId = entry.getKey();
                Book foundBook = books.get(foundBookId);
                foundBooks.add(foundBook);
            }
        }
        return foundBooks;
    }

    @Override
    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Map.Entry<String, Book> bookListing : books.entrySet()){
            for (String bookId : rentedBooks.keySet()){
                if (!(bookListing.getKey().equals(bookId))){
                    availableBooks.add(bookListing.getValue());
                }
            }
        }
        return availableBooks;
    }
}
