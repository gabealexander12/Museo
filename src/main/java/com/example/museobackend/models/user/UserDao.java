package com.example.museobackend.models.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The UserDao class provides methods for managing User objects in the database.
 *
 * @author Kabiltan
 */
@Service
public class UserDao {

    /**
     * The UserRepository used to access User objects in the database.
     */
    @Autowired
    private UserRepository repository;

    /**
     * Saves a User object to the database.
     *
     * @param user The User object to save.
     */
    public void save(User user){
        repository.save(user);
    }

    /**
     * Deletes a User object from the database.
     *
     * @param user The User object to delete.
     */
    public void delete(User user){
        repository.delete(user);
    }

    /**
     * Returns a list of all User objects in the database.
     *
     * @return A list of all User objects in the database.
     */
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users::add);
        return users;
    }

    /**
     * Returns a User object from the database with the given email.
     *
     * @param email The email to search for.
     * @return The User object with the given email, or null if no such user exists.
     */
    public User getUserByEmail(String email){
        //List<User> users = (List<User>) repository.findByEmail(email);
        //System.out.println("Searching for email address: " + email);
        //System.out.println("Number of users found: " + users.size());

        return repository.findByEmail(email);
    }
}
