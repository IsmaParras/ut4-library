package org.iesfm.library;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String[] genres;

    public Book(String isbn, String title, String author, String[] genres) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public void showInfo() {
        System.out.println("ISBN: " + isbn + ". Título: " + title + ". Autor: " + author);
        System.out.println("Géneros");
        for(String genre: genres){
            System.out.println(genre);
        }
    }


    public boolean hasGenre(String genre) {
        for (String g : genres) {
            if (g.equals(genre)) {
                return true;
            }
        }
        return false;
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

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Arrays.equals(getGenres(), book.getGenres());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getIsbn(), getTitle(), getAuthor());
        result = 31 * result + Arrays.hashCode(getGenres());
        return result;
    }
}
