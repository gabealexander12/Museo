package com.example.museobackend.models.museum;

import com.example.museobackend.models.museum.Museum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface extends Spring Data's CrudRepository to provide basic CRUD operations
 * for Museum entities.
 *
 * @author Kabiltan
 * @version 1.0
 */

@Repository
public interface MuseumRepository extends JpaRepository<Museum, Integer> {

}
