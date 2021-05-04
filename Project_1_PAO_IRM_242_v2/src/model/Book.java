package model;

import java.time.LocalDate;

//

public class Book implements Comparable<Book>{

    private String title;
    private Section section;
    private Author author;
    private LocalDate publishDate;

    public Book(String title, Section section, Author author, LocalDate publishDate){

        this.title = title;
        this.section = section;
        this.author = author;
        this.publishDate = publishDate;
    }

    public Book(Book c){

        this.title = c.getTitle();
        this.section = c.getSection();
        this.author = c.getAuthor();
        this.publishDate = c.getPublishDate();
    }

    @Override
    public int compareTo(Book c) {

        if(this.title.equals(c.getTitle()) == true)
            return this.author.compareTo(c.getAuthor());
        else
            return this.title.compareTo(c.getTitle());
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", section=" + section +
                ", author=" + author.getFirstName() + " " + author.getLastName() +
                ", publishDate=" + publishDate +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Section getSection() {
        return section;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}

