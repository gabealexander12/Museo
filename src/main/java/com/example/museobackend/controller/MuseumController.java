package com.example.museobackend.controller;

import com.example.museobackend.models.museum.Museum;
import com.example.museobackend.models.museum.MuseumDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class represents the RESTful API endpoints
 * for managing museum objects.
 *
 * @author Kabiltan
 * @version 1.0
 */
@RestController
@CrossOrigin
public class MuseumController {

    @Autowired
    private MuseumDao museumDao;

    /**
     * This method handles GET requests to retrieve a list of all
     * museums currently stored in the database. It returns a list
     * of Museum objects.
     *
     * @return List of Museum objects
     */
    @GetMapping("/museum/get-all")
    public List<Museum> getAllMuseums(){
        return museumDao.getAllMuseums();
    }

    /**
     * This method handles POST requests to save a new museum object
     * to the database. It takes a Museum object as a request body
     * and passes it to the MuseumDao's save method.
     *
     * @param museum - Museum object to be saved to the database
     */
    @PostMapping("/museum/save")
    public void save(@RequestBody Museum museum){
        museumDao.save(museum);
    }

}
