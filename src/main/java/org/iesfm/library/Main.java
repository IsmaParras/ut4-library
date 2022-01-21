package org.iesfm.library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(
                "sdfs",
                "titulo",
                "autor",
                genres("Novela", "Historica")
        );

        if (book1.hasGenre("Novela")) {
            System.out.println("El libro " + book1.getTitle() + " es una novela");
        } else {
            System.out.println("El libro " + book1.getTitle() + " no es una novela");
        }
    }

    static String[] genres(String... values) {
        return values;
    }
}
