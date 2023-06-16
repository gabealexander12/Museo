package com.example.museobackend.models.exhibit.DTOs;

public class ExhibitAudioDto {

    private long id;
    private String audioFile;

    public ExhibitAudioDto(long id, String audioFile) {
        this.id = id;
        this.audioFile = audioFile;
    }

    public long getId() {
        return id;
    }

    public String getAudioFile() {
        return audioFile;
    }

}
