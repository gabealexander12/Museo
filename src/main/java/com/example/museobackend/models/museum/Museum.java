package com.example.museobackend.models.museum;

import com.example.museobackend.models.exhibit.Exhibit;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This class represents a museum object that is stored in the "museums" table in the database.
 * It contains fields for the museum's ID, name, address, website, director ID
 */
@Entity
@Table(name = "museums")
public class Museum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "website")
    private String website;

    @Column(name = "director")
    private int director;

    @OneToMany(mappedBy = "museum", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exhibit> exhibits;

    /**
     * Default constructor for the Museum class.
     */
    public Museum() {

    }

    /**
     * Constructor for the Museum class that sets all of its fields.
     * @param id the ID of the museum
     * @param name the name of the museum
     * @param address the address of the museum
     * @param website the website of the museum
     * @param museumDirector the ID of the museum's director
     */
    public Museum(int id, String name, String address, String website, int museumDirector) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.website = website;
        this.director = museumDirector;
    }

    // Getters and setters for the fields

    /**
     * Returns the ID of the museum.
     * @return the ID of the museum
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the museum.
     * @param id the ID of the museum
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the name of the museum.
     * @return the name of the museum
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the museum.
     * @param name the name of the museum
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the museum.
     * @return the address of the museum
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the museum.
     * @param address the address of the museum
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the website of the museum.
     * @return the website of the museum
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website of the museum.
     * @param website the website of the museum
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Returns the ID of the museum's director.
     * @return the ID of the museum's director
     */
    public int getDirector() {
        return director;
    }

    /**
     * Sets the ID of the museum's director.
     * @param director the ID of the museum's director
     */
    public void setDirector(int director) {
        this.director = director;
    }


}