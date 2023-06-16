
package com.example.museobackend.controller;

import com.example.museobackend.models.user.User;
import com.example.museobackend.models.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



/**
 * This class serves as the REST controller for the User model.
 * It handles incoming HTTP requests for user data, and returns
 * appropriate HTTP responses with user data.
 *
 *
 * @author Kabiltan
 * @version 1.0
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserDao userDao;

    /**
     * Endpoint to retrieve all users.
     *
     * @return A list of User objects representing all users in the system.
     */
    @GetMapping("/user/get-all")
    public List<User> getALLUsers(){
        return userDao.getAllUsers();
    }

    /**
     * Endpoint to save a new user.
     *
     * @param user The User object representing the new user to be saved.
     */
    @PostMapping("/user/save")
    public void save(@RequestBody User user){
        userDao.save(user);
    }


    /**
     * Endpoint to retrieve a user by email.
     *
     * @param email The email of the user to retrieve.
     * @return The User object with the given email, or null if not found.
     */
    @GetMapping("/user/get-by-email")
    public User getByEmail(@RequestParam("email") String email){
        return userDao.getUserByEmail(email);
    }

}
