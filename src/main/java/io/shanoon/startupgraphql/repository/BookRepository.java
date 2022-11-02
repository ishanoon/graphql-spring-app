package io.shanoon.startupgraphql.repository;

import io.shanoon.startupgraphql.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}
