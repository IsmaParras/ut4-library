package org.iesfm.library;

import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;

import java.util.Arrays;
import java.util.Objects;

public class Library implements ILibrary {
    private String name;
    private Book[] catalogue;
    private Member[] members;
    private BookLend[] bookLends;

    public Library(String name, Book[] catalogue, Member[] members, BookLend[] bookLends) {
        this.name = name;
        this.catalogue = catalogue;
        this.members = members;
        this.bookLends = bookLends;
    }

    @Override
    public Book returnBook(String isbn) throws BookNotFoundException {
        for (Book catalogue: catalogue){
            if (catalogue.getIsbn().equals(isbn)){
                return catalogue;
            }
        }
        throw new BookNotFoundException();
    }

    @Override
    public Member returnMember(String nif) throws MemberNotFoundException {
        for (Member member: members){
            if (member.getNif().equals(nif)){
                return member;
            }
        }
        throw new MemberNotFoundException();
    }

    @Override
    public boolean lend(String nif, String isbn) throws BookNotFoundException, MemberNotFoundException{
        if (!returnBook(isbn).equals(isbn)) {
            throw new BookNotFoundException();
        }
        if (!returnMember(nif).equals(nif)) {
            throw new MemberNotFoundException();
        }
        for (BookLend bookLend: bookLends){
            if (bookLend.getIsbn().equals(isbn) && bookLend.getMemberNif().equals(nif)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Book[] catalogue) {
        this.catalogue = catalogue;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public BookLend[] getBookLends() {
        return bookLends;
    }

    public void setBookLends(BookLend[] bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Arrays.equals(catalogue, library.catalogue) && Arrays.equals(members, library.members) && Arrays.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(catalogue);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(bookLends);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", catalogue=" + Arrays.toString(catalogue) +
                ", members=" + Arrays.toString(members) +
                ", bookLends=" + Arrays.toString(bookLends) +
                '}';
    }
}
