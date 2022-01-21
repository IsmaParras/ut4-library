package org.iesfm.library;

import java.util.Objects;

public class BookLend {
    private String isbn;
    private String memberNif;
    private String lendDate;
    private String returnDate;

    public BookLend(String isbn, String memberNif, String lendDate, String returnDate) {
        this.isbn = isbn;
        this.memberNif = memberNif;
        this.lendDate = lendDate;
        this.returnDate = returnDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMemberNif() {
        return memberNif;
    }

    public void setMemberNif(String memberNif) {
        this.memberNif = memberNif;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return Objects.equals(getIsbn(), bookLend.getIsbn()) && Objects.equals(getMemberNif(), bookLend.getMemberNif()) && Objects.equals(getLendDate(), bookLend.getLendDate()) && Objects.equals(getReturnDate(), bookLend.getReturnDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getMemberNif(), getLendDate(), getReturnDate());
    }
}
