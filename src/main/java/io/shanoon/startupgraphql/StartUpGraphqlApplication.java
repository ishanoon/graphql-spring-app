package io.shanoon.startupgraphql;

import io.shanoon.startupgraphql.model.Authors;
import io.shanoon.startupgraphql.model.Books;
import io.shanoon.startupgraphql.repository.AuthorRespository;
import io.shanoon.startupgraphql.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StartUpGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartUpGraphqlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRespository authorRespository, BookRepository bookRepository){
		return args -> {
			Authors author1 = authorRespository.save(new Authors(null,"author1"));
			Authors author2 = authorRespository.save(new Authors(null,"author"));

			bookRepository.saveAll(List.of(
					new Books(null,"Getting Started",author1),
					new Books(null, "Happy Life", author1),
					new Books(null, "Moving up", author2)
			));

		};
	}
}
