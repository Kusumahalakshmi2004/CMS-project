package com.cms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "website_content")
public class Heading {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String heading;

    public Heading() {}

    public Heading(String heading) {
        this.heading = heading;
    }

    public Long getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
