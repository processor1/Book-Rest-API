/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rest.app1;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

import org.services.BookServices;
import org.models.Book;

@Path("/books")
public class BookRest {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN, MediaType.TEXT_HTML})
    public Response getBooks(@Context HttpHeaders headers) {
        BookServices bks = new BookServices();
        List<Book> bookList = bks.getAllBooks();

        MediaType mediaType = headers.getAcceptableMediaTypes().isEmpty() ? MediaType.APPLICATION_JSON_TYPE : headers.getAcceptableMediaTypes().get(0);

        switch (mediaType.toString()) {
            case MediaType.APPLICATION_XML:
                return Response.ok(bookList, MediaType.APPLICATION_XML).build();

            case MediaType.TEXT_HTML:
                StringBuilder html = new StringBuilder("<html><body><h2>Books</h2><ul>");
                for (Book b : bookList) {
                    html.append("<li>").append(b.getTitle()).append(" by ").append(b.getAuthor()).append("</li>");
                }
                html.append("</ul></body></html>");
                return Response.ok(html.toString(), MediaType.TEXT_HTML).build();

            case MediaType.TEXT_PLAIN:
                StringBuilder plain = new StringBuilder();
                for (Book b : bookList) {
                    plain.append(b.getTitle()).append(" - ").append(b.getAuthor()).append("\n");
                }
                return Response.ok(plain.toString(), MediaType.TEXT_PLAIN).build();

            case MediaType.APPLICATION_JSON:
            default:
                return Response.ok(bookList, MediaType.APPLICATION_JSON).build();
        }
    }
}
