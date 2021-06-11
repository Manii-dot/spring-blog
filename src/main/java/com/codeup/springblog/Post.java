package com.codeup.springblog;

import javax.persistence.*;

@Entity
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, length = 100)
        private String name;

        @Column(nullable = false, length = 50)
        private String title;

        @Column(nullable = false)
        private String body;

        @Column(nullable = false)
        private int age;

        @Column(nullable = false)
        private String gender;

        @Column(nullable = false)
        private String description;

         public Post() {
         }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
