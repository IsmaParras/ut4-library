package org.iesfm.library;

import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;

public interface ILibrary {
     Book returnBook(String isbn) throws BookNotFoundException;
     Member returnMember(String nif) throws MemberNotFoundException;
     boolean lend(String nif, String isbn) throws BookNotFoundException, MemberNotFoundException;
}
