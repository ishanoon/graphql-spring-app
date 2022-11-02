package io.shanoon.startupgraphql.service;

import io.shanoon.startupgraphql.model.Authors;
import io.shanoon.startupgraphql.repository.AuthorRespository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRespository authorRepository;

    public AuthorService(AuthorRespository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Iterable<Authors> authors() {
        return authorRepository.findAll();
    }
}
