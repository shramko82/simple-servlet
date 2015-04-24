package ua.shramko.simpleservlet.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment implements Comparable {
    Integer id;
    String text;
    Date dateOfCreation;

    public Comment(Integer id, String text, Date dateOfCreation) {
        this.id = id;
        this.text = text;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != comment.id) return false;
        if (getText() != null ? !getText().equals(comment.getText()) : comment.getText() != null)
            return false;
        return !(dateOfCreation != null ? !dateOfCreation.equals(comment.dateOfCreation) : comment.dateOfCreation != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        return "(" + format.format(getDateOfCreation()) + ") " + getText();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        Comment entry = (Comment) o;
        return -getDateOfCreation().compareTo(entry.getDateOfCreation());
    }
}
