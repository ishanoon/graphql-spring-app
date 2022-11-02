package io.shanoon.startupgraphql.controller;

import io.shanoon.startupgraphql.service.BookService;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
}
