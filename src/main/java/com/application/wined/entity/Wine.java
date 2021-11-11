package com.application.wined.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wines")
public class Wine
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "vintage")
    private Integer vintage;

    @Column(name = "country")
    private String country;

    @Column(name = "strain")
    private String strain;

    @Column(name ="rating")
    private Integer rating;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStrain()
    {
        return strain;
    }

    public void setStrain(String strain)
    {
        this.strain = strain;
    }

    public Integer getVintage()
    {
        return vintage;
    }

    public void setVintage(Integer vintage)
    {
        this.vintage = vintage;
    }

    public Integer getRating()
    {
        return rating;
    }

    public void setRating(Integer rating)
    {
        this.rating = rating;
    }

    public Wine()
    {

    }

    public Wine(String name, String strain, String country, Integer vintage, Integer rating)
    {
        super();
        this.name = name;
        this.country = country;
        this.strain = strain;
        this.vintage = vintage;
        this.rating = rating;
    }
}
