package io.shanoon.startupgraphql.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Books> books = new ArrayList<>();

    public Authors() {
    }

    public Authors(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<Books> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authors authors = (Authors) o;
        return Objects.equals(Id, authors.Id) && Objects.equals(name, authors.name) && Objects.equals(books, authors.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, books);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
