package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryExtendedImplTest {

    LibraryExtendedImpl testLibrary =  new LibraryExtendedImpl();

    @BeforeEach
    void setUp() {
        LibraryExtendedImpl testLibrary =  new LibraryExtendedImpl();
    }

    @AfterEach
    void tearDown() {
        testLibrary = null;
    }

    @Test
    void addClient() {
        //given - dane wejsciowe
        //when - wywolanie metody testowanej
        String testClientId = testLibrary.addClient("testFirstName", "testLastName", "testEmail@testEmail.testEmail");
        //then - faktyczna logika testu
        assertTrue(testLibrary.clients.containsKey(testClientId));
    }

    @Test
    void removeClient() {
    }

    @Test
    void addBook() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void rentBookToClient() {
    }

    @Test
    void returnBookToLibrary() {
    }

    @Test
    void findBooksByAuthor() {
    }

    @Test
    void findClientsByLastName() {
    }

    @Test
    void findBooksByTitle() {
    }

    @Test
    void getRentedBooksOfClient() {
    }

    @Test
    void getAvailableBooks() {
    }
}