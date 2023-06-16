package com.example.museobackend.models.exhibit.DTOs;

public class ExhibitArtistDto {

    private long id;
    private String artist;

    public ExhibitArtistDto(long id, String artist) {
        this.id = id;
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }
}
