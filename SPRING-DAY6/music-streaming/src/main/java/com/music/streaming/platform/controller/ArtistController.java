package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;

@RestController
@RequestMapping("music/platform/v1/artists")
public class ArtistController {

    private final ArtistService artistService;

//    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    
    @PostMapping
    public ResponseEntity<Artist> createArtist(@RequestBody ArtistRequest request) {
        return new ResponseEntity<>(artistService.createArtist(request), HttpStatus.OK);
    }

    
    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtists() {
        return new ResponseEntity<>(artistService.getAllArtists(), HttpStatus.OK);
    }

    
    @GetMapping("/{artistId}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long artistId) {
        return new ResponseEntity<>(artistService.getArtistById(artistId), HttpStatus.OK);
    }

    
    @PutMapping("/{artistId}")
    public ResponseEntity<Artist> updateArtist(@PathVariable Long artistId,
                                               @RequestBody ArtistRequest request) {
        return new ResponseEntity<>(artistService.updateArtist(artistId, request), HttpStatus.OK);
    }

    
    @DeleteMapping("/{artistId}")
    public ResponseEntity<Void> deleteArtist(@PathVariable Long artistId) {
        artistService.deleteArtist(artistId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}