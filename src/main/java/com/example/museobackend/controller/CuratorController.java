package com.example.museobackend.controller;


import com.example.museobackend.models.curator.Curator;
import com.example.museobackend.models.curator.CuratorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class represents the RESTful API endpoints
 * for managing curator objects.
 *
 * @author Kabiltan
 * @version 1.0
 */
@RestController
@CrossOrigin
public class CuratorController {


    @Autowired
    private CuratorDao curatorDao;

    /**
     * Endpoint to retrieve a curator by username.
     *
     * @param username The username of the curator to retrieve.
     * @return The Curator object with the given username, or null if not found.
     */
    @GetMapping("/curator/get-by-username")
    public Curator getByUsername(@RequestParam("username") String username){
        return curatorDao.findByUsername(username);
    }

    /**
     * Endpoint to save a new curator.
     *
     * @param curator The Curator object representing the new curator to be saved.
     */
    @PostMapping("/curator/save")
    public void save(@RequestBody Curator curator){
        curatorDao.save(curator);
    }

}
