/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isi7
 */
public class Movie {
    private int id;
    private String title;
    private int publishYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Movie() {
    }

    public Movie(int id, String title, int publishYear) {
        this.id = id;
        this.title = title;
        this.publishYear = publishYear;
    }

    
    public String toString() {
        return "Movie{" + "id= " + id + ", title= " + title + ", publishYear= " + publishYear + '}';
    }
}
