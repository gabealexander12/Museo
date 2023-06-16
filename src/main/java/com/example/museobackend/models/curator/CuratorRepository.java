package com.example.museobackend.models.curator;
import com.example.museobackend.models.curator.Curator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuratorRepository extends JpaRepository<Curator, Integer> {

    Curator findByUsername(String username);

}
