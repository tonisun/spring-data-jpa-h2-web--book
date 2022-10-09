package de.egosanto.sdjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.egosanto.sdjpa.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
