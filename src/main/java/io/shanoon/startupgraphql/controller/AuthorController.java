package io.shanoon.startupgraphql.controller;

import io.shanoon.startupgraphql.model.Authors;
import io.shanoon.startupgraphql.service.AuthorService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @QueryMapping
    Iterable<Authors> authors() {
        return authorService.authors();
    }
}
