
package com.example.museobackend.models.exhibit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ByteArrayConverter {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:51000/museo";
        String username = "root";
        String password = "knight";
        byte[] augustLightByteArray = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\AugustLightAudio.mp3");
        byte[] augustLightByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\AugustLight.jpg");
        byte[] ladyCarolineByteArray = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\Portrait of Lady Caroline Montagu.mp3");
        byte[] ladyCarolineByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\LadyCarolineImage.jpg");
        byte[] DeathOfSocratesByteArrayAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\DeathOfSocratesAudio.mp3");
        byte[] DeathOfSocratesByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\DeathOfSocratesImage.jpg");
        byte[] TheMusiciansByteArrayAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\TheMusiciansAudio.mp3");
        byte[] TheMusiciansByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\TheMusiciansImage.jpg");
        byte[] AmericanGothicByteArrayAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\AmericanGothicAudio.mp3");
        byte[] AmericanGothicByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\AmericanGothicImage.jpg");
        byte[] TheWalkingManByteArrayAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\TheWalkingManAudio.mp3");
        byte[] TheWalkingManByteArrayImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\TheWalkingManImage.jpg");
        byte[] GeorgeWAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GeorgeW.mp3");
        byte[] GeorgeWImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GeorgeW.jpg");
        byte[] GertrudeSteinAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GertrudeStein.mp3");
        byte[] GertrudeSteinImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GertrudeStein.jpg");
        byte[] GulfStreamAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GulfStream.mp3");
        byte[] GulfStreamImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\GulfStream.jpg");
        byte[] NighthawksAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\Nighthawks.mp3");
        byte[] NighthawksImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\Nighthawks.jpg");
        byte[] SpiritWallAudio = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\SpiritWall.mp3");
        byte[] SpiritWallImage = fileContentsToByteArray("C:\\Users\\gabea\\AndroidStudio Projects\\museo-backend\\src\\main\\resources\\SpiritWall.jpg");


//        updateSQLDatabaseAudio(url, username, password, ladyCarolineByteArray, 1);
//        updateSQLDatabaseImage(url, username, password, ladyCarolineByteArrayImage, 1);
//        updateSQLDatabaseAudio(url, username, password, augustLightByteArray, 2);
//        updateSQLDatabaseImage(url, username, password, augustLightByteArrayImage, 2);
//        updateSQLDatabaseAudio(url, username, password, DeathOfSocratesByteArrayAudio, 3);
//        updateSQLDatabaseImage(url, username, password, DeathOfSocratesByteArrayImage, 3);
//        updateSQLDatabaseAudio(url, username, password, TheMusiciansByteArrayAudio, 4);
//        updateSQLDatabaseImage(url, username, password, TheMusiciansByteArrayImage, 4);
//        updateSQLDatabaseAudio(url, username, password, AmericanGothicByteArrayAudio, 5);
//        updateSQLDatabaseImage(url, username, password, AmericanGothicByteArrayImage, 5);
//        updateSQLDatabaseAudio(url, username, password, TheWalkingManByteArrayAudio, 6);
//        updateSQLDatabaseImage(url, username, password, TheWalkingManByteArrayImage, 6);
//        updateSQLDatabaseAudio(url, username, password, GeorgeWAudio, 7);
//        updateSQLDatabaseImage(url, username, password, GeorgeWImage, 7);
//        updateSQLDatabaseAudio(url, username, password, GertrudeSteinAudio, 8);
//        updateSQLDatabaseImage(url, username, password, GertrudeSteinImage, 8);
//        updateSQLDatabaseAudio(url, username, password, GulfStreamAudio, 9);
//        updateSQLDatabaseImage(url, username, password, GulfStreamImage, 9);
//        updateSQLDatabaseAudio(url, username, password, NighthawksAudio, 10);
//        updateSQLDatabaseImage(url, username, password, NighthawksImage, 10);
//        updateSQLDatabaseAudio(url, username, password, SpiritWallAudio, 11);
//        updateSQLDatabaseImage(url, username, password, SpiritWallImage, 11);

    }

    public static void updateSQLDatabaseAudio(String url, String username, String password, byte[] byteArray, int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "UPDATE exhibits SET audio_file = (?) WHERE id = (?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBytes(1, byteArray);
            statement.setInt(2, id);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateSQLDatabaseImage(String url, String username, String password, byte[] byteArray, int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "UPDATE exhibits SET image_file = (?) WHERE id = (?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBytes(1, byteArray);
            statement.setInt(2, id);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static byte[] fileContentsToByteArray(String filepath) {
        File file = new File(filepath);
        byte[] fileContents = new byte[(int) file.length()];
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read(fileContents);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents;
    }
}
