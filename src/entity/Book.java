/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Book {
private  String name;
private String author;
private Integer publishedYear;
private String isbn;

    public Book() {
    }

    public Book(String name, String author, Integer publishedYear, String isbn) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
    }

    public Book(String voina_i_Mir, String lTolstoy, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publishedYear=" + publishedYear + ", isbn=" + isbn + '}';
    }
    
}
