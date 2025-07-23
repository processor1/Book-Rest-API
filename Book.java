/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.models;

/**
 *
 * @author Mark Kpodo
 */
public class Book {

    private String author;
    private String title;
    private String ibsn;

    public Book() {

    }

    public Book(String author, String title, String ibsn) {
        this.author = author;
        this.title = title;
        this.ibsn = ibsn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

}
