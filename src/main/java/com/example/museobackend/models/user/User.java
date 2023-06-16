package com.example.museobackend.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The User class represents a user of the Museo Backend system.
 * A user has a unique email address, a username, and a password.
 *
 * @author Kabiltan
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * The unique email address of the user.
     */
    @Id
    @Column(length = 255)
    private String email;

    /**
     * The username of the user.
     */
    @Column(length = 255)
    private String username;

    /**
     * The password of the user.
     */
    @Column(length = 255)
    private String password;

    /**
     * Creates a new User object with default values.
     */
    public User() {}

    /**
     * Creates a new User object with the given username, email address, and password.
     *
     * @param username The username of the user.
     * @param email_address The unique email address of the user.
     * @param password The password of the user.
     */
    public User(String username, String email_address, String password) {
        this.username = username;
        this.email = email_address;
        this.password = password;
    }

    /**
     * Returns the username of the user.
     *
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The username of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the email address of the user.
     *
     * @return The email address of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email The email address of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password The password of the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
