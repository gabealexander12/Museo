package com.example.museobackend.models.user;

import com.example.museobackend.models.user.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The UserRepository interface extends the Spring Data CrudRepository interface
 * and provides additional methods for accessing User objects in the database.
 *
 * @author Kabiltan
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);


}
