package de.egosanto.sdjpa.domain;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity -> Book { id (PK), title, isbn, publisher }
 * 
 * @author Toni Zeidler
 *
 */
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	
	private String isbn;
	
	private String publischer;
	
	/**
	 * No Args Constructor Just for Hibernate
	 */
	public Book() {
		
	}

	public Book(String title, String isbn, String publischer) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publischer = publischer;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the publischer
	 */
	public String getPublischer() {
		return publischer;
	}

	/**
	 * @param publischer the publischer to set
	 */
	public void setPublischer(String publischer) {
		this.publischer = publischer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", publischer=" + publischer + "]";
	}
	
	
	
}
