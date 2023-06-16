package com.example.museobackend.models.curator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuratorDao {

    @Autowired
    private CuratorRepository repository;

    /**
     * Returns the Curator entity with the given username.
     *
     * @param username the username to search for
     * @return the Curator entity with the given username, or null if not found
     */
    public Curator findByUsername(String username) {
        return repository.findByUsername(username);
    }

    /**
     * Saves the given Curator entity to the database.
     *
     * @param curator the Curator entity to save
     * @return the saved Curator entity
     */
    public Curator save(Curator curator) {
        return repository.save(curator);
    }

}
