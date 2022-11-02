package io.shanoon.startupgraphql.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    private Authors author;

    public Books() {
    }

    public Books(Long id, String title, Authors author) {
        Id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Authors getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(Id, books.Id) && Objects.equals(title, books.title) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, title, author);
    }

    @Override
    public String toString() {
        return "Books{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
