package io.shanoon.startupgraphql.repository;

import io.shanoon.startupgraphql.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Authors,Long> {
}
