package com.example.museobackend.models.exhibit;
import com.example.museobackend.models.exhibit.ExhibitRepository;
import com.example.museobackend.models.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExhibitDao {
    @Autowired
    private ExhibitRepository repository;

    public List<Exhibit> getExhibitsByMuseumID(int museumID) {
        List<Exhibit> exhibits = repository.findByMuseumId(museumID);
        return exhibits;
    }


    public Exhibit getExhibitById(int id) {
        Exhibit exhibit = repository.getExhibitById(id);
        return exhibit;
    }

    public List<Exhibit> getAllExhibits(){
        List<Exhibit> exhibits= new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(exhibits::add);
        return exhibits;
    }

}

