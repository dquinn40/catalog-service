package com.polarbookshop.catalogservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public class Book {
    @NotBlank(message = "The book ISBN must be defined.")
    @Pattern(regexp = "^[0-9]{10}|[0-9]{13}$", message = "The ISBN format must follow the standards ISBN-10 or ISBN-13")
    private String isbn;

    @NotBlank(message = "The book title must be defined")
    private String title;

    @NotBlank(message = "The book author must be defined")
    private String author;

    @NotNull(message = "The book price must be defined.")
    @Positive(message = "the book price must be greater than zero")
    private Double price;

    public Book(String isbn, String title, String author, Double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String isbn() {
        return isbn;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public Double price() {
        return price;
    }
}
