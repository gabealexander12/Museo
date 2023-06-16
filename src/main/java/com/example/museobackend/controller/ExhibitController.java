package com.example.museobackend.controller;

import com.example.museobackend.models.exhibit.DTOs.ExhibitArtistDto;
import com.example.museobackend.models.exhibit.DTOs.ExhibitAudioDto;
import com.example.museobackend.models.exhibit.DTOs.ExhibitDescriptionDto;
import com.example.museobackend.models.exhibit.DTOs.ExhibitImageDto;
import com.example.museobackend.models.exhibit.DTOs.ExhibitNameDto;
import com.example.museobackend.models.exhibit.ExhibitDao;
import com.example.museobackend.models.exhibit.Exhibit;
import com.example.museobackend.models.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExhibitController {

    @Autowired
    private ExhibitDao exhibitDao;

    /**
     * Endpoint to retrieve all exhibits for a given Museum.
     *
     * @return A list of Exhibit objects representing all exhibits for the museum matching the id.
     */
    @GetMapping ("exhibit/get-by-museumId")
    public List<Exhibit> getExhibitsByMuseum(@RequestParam("museumID") int museumID){
        return exhibitDao.getExhibitsByMuseumID(museumID);
    }

    @GetMapping ("exhibit/get-by-id")
    public Exhibit getExhibitById (@RequestParam("id") int id){
        return exhibitDao.getExhibitById(id);
    }

    @GetMapping("exhibit/get-all-names")
    public List<ExhibitNameDto> getAllExhibitNames() {
        List<Exhibit> exhibits = exhibitDao.getAllExhibits();
        List<ExhibitNameDto> exhibitDtos = new ArrayList<>();

        for (Exhibit exhibit : exhibits) {
            exhibitDtos.add(new ExhibitNameDto(exhibit.getId(), exhibit.getName()));
        }

        return exhibitDtos;
    }

    @GetMapping("exhibit/get-all-artists")
    public List<ExhibitArtistDto> getAllExhibitArtists() {
        List<Exhibit> exhibits = exhibitDao.getAllExhibits();
        List<ExhibitArtistDto> exhibitDtos = new ArrayList<>();

        for (Exhibit exhibit : exhibits) {
            exhibitDtos.add(new ExhibitArtistDto(exhibit.getId(), exhibit.getArtist()));
        }

        return exhibitDtos;
    }

    @GetMapping("exhibit/get-all-images")
    public List<ExhibitImageDto> getAllExhibitImages() {
        List<Exhibit> exhibits = exhibitDao.getAllExhibits();
        List<ExhibitImageDto> exhibitDtos = new ArrayList<>();

        for (Exhibit exhibit : exhibits) {
            exhibitDtos.add(new ExhibitImageDto(exhibit.getId(), exhibit.getImageBase64()));
        }

        return exhibitDtos;
    }

    @GetMapping("exhibit/get-all-audio")
    public List<ExhibitAudioDto> getAllExhibitAudio() {
        List<Exhibit> exhibits = exhibitDao.getAllExhibits();
        List<ExhibitAudioDto> exhibitDtos = new ArrayList<>();

        for (Exhibit exhibit : exhibits) {
            exhibitDtos.add(new ExhibitAudioDto(exhibit.getId(), exhibit.getAudioBase64()));
        }

        return exhibitDtos;
    }

    @GetMapping("exhibit/get-all-descriptions")
    public List<ExhibitDescriptionDto> getAllExhibitDescriptions() {
        List<Exhibit> exhibits = exhibitDao.getAllExhibits();
        List<ExhibitDescriptionDto> exhibitDtos = new ArrayList<>();

        for (Exhibit exhibit : exhibits) {
            exhibitDtos.add(new ExhibitDescriptionDto(exhibit.getId(), exhibit.getDescription()));
        }

        return exhibitDtos;
    }

}


