/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.services;

import java.util.List;
import org.models.Book;

/*\
 *  @author Mark Kpodo
 */
public class BookServices {

    public List<Book> getAllBooks() {

        List<Book> books = List.of(new Book("Doe Joe", "Bad Man Attack", "3023942"),
                new Book("Jki. White", "Coding Java", "112400"), new Book("Lucs Brght", "Nothing Happened", "2342342"),
                new Book("Mike Denis", "Music Person", "4565454"), new Book("Mann Thai", "Meet Yourself", "34353"),
                new Book("Litu Dike", "Nothing Else Goes Easy", "2030494"), new Book("Dowg Lowe", "Physical Disorder", "33342"),
                new Book("George Orwell", "1984", "978-0451524935"),
                new Book("Harper Lee", "To Kill a Mockingbird", "978-0061120084"),
                new Book("F. Scott Fitzgerald", "The Great Gatsby", "978-0743273565"),
                new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "978-0590353427"),
                new Book("J.R.R. Tolkien", "The Hobbit", "978-0547928227"),
                new Book("Jane Austen", "Pride and Prejudice", "978-1503290563"),
                new Book("Markus Zusak", "The Book Thief", "978-0375842207"),
                new Book("Dan Brown", "The Da Vinci Code", "978-0307474278"),
                new Book("Stephen King", "The Shining", "978-0307743657"),
                new Book("Mary Shelley", "Frankenstein", "978-0486282114"));
        return books;
    }

}
