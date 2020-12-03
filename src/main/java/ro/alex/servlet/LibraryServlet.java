package ro.alex.servlet;

import ro.alex.model.Books;
import ro.alex.service.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LibraryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookType = req.getParameter("Type");

        BookService bookService = new BookService();

        Books type = Books.valueOf(bookType);

        List<String> books = bookService.getAvailableBooks(type);

        req.setAttribute("books", books);

        RequestDispatcher view = req.getRequestDispatcher("result.jsp");

        view.forward(req, resp);

    }


}
