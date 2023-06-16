package com.example.museobackend.models.museum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a DAO for managing Museum objects and persisting them
 * to the database using a MuseumRepository.
 *
 * @author Kabiltan
 * @version 1.0
 */
@Service
public class MuseumDao {

    @Autowired
    private MuseumRepository repository;

    /**
     * Saves a museum to the database.
     *
     * @param museum the museum to be saved.
     */
    public void save(Museum museum){
        repository.save(museum);
    }

    /**
     * Deletes a museum from the database.
     *
     * @param museum the museum to be deleted.
     */
    public void delete(Museum museum){
        repository.delete(museum);
    }

    /**
     * Retrieves all museums from the database.
     *
     * @return a List of Museum objects representing all museums in the database.
     */
    public List<Museum> getAllMuseums(){
        List<Museum> museums = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(museums::add);
        return museums;
    }
}
