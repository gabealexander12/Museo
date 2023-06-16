
package com.example.museobackend.models.curator;

import javax.persistence.*;

/**
 * Represents a curator in the museum.
 * Curators have a unique identifier, a username, and a password.
 *
 * @author Kabiltan
 */
@Entity
@Table(name = "curators")
public class Curator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    /**
     * Creates a new curator with no username or password.
     */
    public Curator() {}

    /**
     * Creates a new curator with the specified username and password.
     * @param username The curator's username.
     * @param password The curator's password.
     */
    public Curator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Returns the curator's unique identifier.
     * @return The curator's ID.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the curator's unique identifier.
     * @param id The curator's ID.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the curator's username.
     * @return The curator's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the curator's username.
     * @param username The curator's username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the curator's password.
     * @return The curator's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the curator's password.
     * @param password The curator's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
