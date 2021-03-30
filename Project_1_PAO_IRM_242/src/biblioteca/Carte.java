package biblioteca;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;

//

public class Carte implements Comparable<Carte>{

    private String title;
    private Sectiune section;
    private Autor author;
    private LocalDate publishDate;

    public Carte (String title, Sectiune section, Autor author, LocalDate publishDate){

        this.title = title;
        this.section = section;
        this.author = author;
        this.publishDate = publishDate;
    }

    public Carte (Carte c){

        this.title = c.getTitle();
        this.section = c.getSection();
        this.author = c.getAuthor();
        this.publishDate = c.getPublishDate();
    }

    @Override
    public int compareTo(Carte c) {

        if(this.title.equals(c.getTitle()) == true)
            return this.author.compareTo(c.getAuthor());
        else
            return this.title.compareTo(c.getTitle());
    }


    @Override
    public String toString() {
        return "Carte{" +
                "title='" + title + '\'' +
                ", section=" + section +
                ", author=" + author.getFirstName() + " " + author.getLastName() +
                ", publishDate=" + publishDate +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Sectiune getSection() {
        return section;
    }

    public Autor getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSection(Sectiune section) {
        this.section = section;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}

