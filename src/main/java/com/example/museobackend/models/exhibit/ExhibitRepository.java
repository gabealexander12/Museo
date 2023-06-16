package com.example.museobackend.models.exhibit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * This interface extends Spring Data's CrudRepository to provide basic CRUD operations
 * for Museum entities.
 *
 * @author Alexander
 * @version 1.0
 */
@Repository
public interface ExhibitRepository extends JpaRepository<Exhibit, Integer> {
    List<Exhibit> findByMuseumId(int museumId);
    Exhibit getExhibitById(int id);



}

