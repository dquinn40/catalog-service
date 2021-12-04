package com.polarbookshop.catalogservice.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import java.time.Instant;

public class Book {
    @Id
    private Long id;

    @Version
    private int version;

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

    private String publisher;

    @CreatedDate
    Instant createdDate;

    @LastModifiedDate
    Instant lastModifiedDate;

    public Book() {}

    public Book(String isbn, String title, String author, Double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(Long id, String isbn, String title, String author, Double price, int version, Instant createdDate, Instant lastModifiedDate) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public static Book build(String isbn, String title, String author, Double price) {
        return new Book(null, isbn, title, author, price, 0, null, null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
