package ro.alex.service;

import ro.alex.model.Books;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<String> getAvailableBooks(Books type) {
        List<String> books = new ArrayList<String>();

        if (type.equals(Books.NOVEL)) {
            books.add("Crima si Pedeapsa");
            books.add("Don Quxite");
        } else if (type.equals(Books.ATLAS)) {
            books.add("Nation Geografic");
            books.add("World Countries");
        } else if (type.equals(Books.CATALOGS)) {
            books.add("Lakes");
            books.add("World Wonders");
        } else {
            books.add("There are no books!");
        }

        return books;
    }
}
