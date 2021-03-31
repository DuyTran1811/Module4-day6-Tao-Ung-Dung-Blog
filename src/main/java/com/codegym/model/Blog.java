package com.codegym.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Basic(optional = false)
    private String img;
    @Column(columnDefinition = "boolean default false")
    private Boolean locked;

    public Blog() {
    }

    public Blog(Long id, String title, String content, String img, Boolean locked) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
        this.locked = locked;
    }

    public Blog(String title, String content, String img, Boolean locked) {
        this.title = title;
        this.content = content;
        this.img = img;
        this.locked = locked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}
