package com.example.museobackend.models.exhibit.DTOs;

public class ExhibitImageDto {

    private long id;
    private String imageFile;

    public ExhibitImageDto(long id, String imageFile) {
        this.id = id;
        this.imageFile = imageFile;
    }

    public long getId() {
        return id;
    }

    public String getImageFile() {
        return imageFile;
    }

}
