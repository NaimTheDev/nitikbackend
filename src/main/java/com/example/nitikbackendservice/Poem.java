package com.example.nitikbackendservice;

import jdk.jfr.DataAmount;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Poems")
public class Poem {
    @Id
    private String id;
    private String title;
    private String poem;

   public Poem () {

   }

    public Poem( String title,String poem ) {

        this.title = title;
        this.poem = poem;
    }



    public String getPoem() {
        return poem;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", poem='" + poem + '\'' +
                '}';
    }
}