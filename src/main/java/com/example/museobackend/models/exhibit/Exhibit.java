package com.example.museobackend.models.exhibit;

import com.example.museobackend.models.museum.Museum;

import java.util.Base64;

import javax.persistence.*;

/**
 * Represents an exhibit in a museum.
 */
@Entity
@Table(name = "exhibits")
public class Exhibit {

    /**
     * The unique identifier of the audio guide.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * The name of the exhibit.
     */
    @Column(length = 255)
    private String name;

    /**
     * The name of the artist.
     */
    @Column(length = 255)
    private String date;

    /**
     * The date of the art.
     */
    @Column(length = 255)
    private String artist;


    /**
     * The description/transcript of the audio guide.
     */
    @Column(length = 65535)
    private String description;

    /**
     * The duration of the audio guide in seconds.
     */
    @Column(name = "duration_seconds")
    private long durationSeconds;

    /**
     * The byte array that corresponds to the mp3 file for the audio.
     */
    @Column()
    private byte[] audioFile;

    /**
     * The byte array that corresponds to the jpg file for the image of the exhibit.
     */
    @Column()
    private byte[] imageFile;

    /**
     * The unique identifier of the museum that the audio guide belongs to (foreign key).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "museum_id", referencedColumnName = "id")
    private Museum museum;

    /**
     * Creates a new Exhibit object with default values.
     */
    public Exhibit() {}

    /**
     * Creates a new Exhibit object with the given values.
     *
     * @param name The name of the artwork.
     * @param description The description/transcript of the audio guide.
     * @param durationSeconds The duration of the audio guide in seconds.
     * @param museum The museum that the audio guide belongs to.
     */
    public Exhibit(String name, String description, long durationSeconds, Museum museum, byte[] audioFile, byte[] imageFile, String date, String artist) {
        this.name = name;
        this.description = description;
        this.durationSeconds = durationSeconds;
        this.museum = museum;
        this.audioFile = audioFile;
        this.imageFile = imageFile;
        this.artist = artist;
        this.date = date;

    }
    /**
     * Returns the image of the exhibit
     *
     * @return The byte array of the image.
     */
    public byte[] getImageFile() {
        return this.imageFile;
    }

    /**
     * Sets the file of the image.
     *
     * @param file byte array of the image.
     */
    public void setImageFile (byte[] file){
        this.imageFile = file;
    }

    /**
     * Returns the image of the exhibit in Base64 format
     *
     * @return The String conversion of the byte array of the image.
     */
    public String getImageBase64() {
        return Base64.getEncoder().encodeToString(this.imageFile);
    }

    /**
     * Returns the String of the date
     *
     * @return The String representing the date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Sets the date of the exhibit
     *
     * @param date String of the date.
     */
    public void setDate (String date){
        this.date = date;
    }

    /**
     * Returns the String of the artist
     *
     * @return The String of the artist
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * Sets the artist name
     *
     * @param artist String of the artist
     */

    public void setArtist (String artist){
        this.artist = artist;
    }
    /**
     * Returns the byte array of the audio guide.
     *
     * @return The byte array of the audio guide.
     */

    public byte[] getAudioFile() {
        return this.audioFile;
    }

    /**
     * Sets the file of the audio guide.
     *
     * @param file byte array of the audio guide.
     */
    public void setAudioFile (byte[] file){
        this.audioFile = file;
    }


    /**
     * Returns the audio of the exhibit in Base64 format
     *
     * @return The String conversion of the byte array of the audio.
     */
    public String getAudioBase64() {
        return Base64.getEncoder().encodeToString(this.audioFile);
    }


    /**
     * Returns the unique identifier of the audio guide.
     *
     * @return The unique identifier of the audio guide.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the audio guide.
     *
     * @param id The unique identifier of the audio guide.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Returns the name of the audio guide.
     *
     * @return The name of the audio guide.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the audio guide.
     *
     * @param name The name of the audio guide.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description/transcript of the audio guide.
     *
     * @return The description/transcript of the audio guide.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description/transcript of the audio guide.
     *
     * @param description The description/transcript of the audio guide.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the duration of the audio guide in seconds.
     *
     * @return The duration of the audio guide in seconds.
     */
    public long getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * Sets the duration of the audio guide in seconds.
     *
     * @param durationSeconds The duration of the audio guide in seconds.
     */
    public void setDurationSeconds(long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * Returns the museum that the audio guide belongs to.
     *
     * @return The museum that the audio guide belongs to.
     */
    public Museum getMuseum() {
        return museum;
    }

    /**
     * Sets the museum tha the audio guide belongs to.
     *
     * @param museum The museum the audio guide is associated with.
     */
    public void setMuseum(Museum museum){
        this.museum = museum;
    }
}


