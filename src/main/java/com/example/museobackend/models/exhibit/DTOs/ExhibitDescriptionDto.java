package com.example.museobackend.models.exhibit.DTOs;

public class ExhibitDescriptionDto {

    private long id;
    private String description;

    public ExhibitDescriptionDto(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
