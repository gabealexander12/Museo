package com.example.museobackend.models.exhibit.DTOs;

public class ExhibitNameDto {
    private long id;
    private String name;

    public ExhibitNameDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
