package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;

@RestController
@RequestMapping("music/platform/v1/tracks")
public class TrackController {

    private final TrackService trackService;

//    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    
    @PostMapping
    public ResponseEntity<Track> createTrack(@RequestBody TrackRequest request) {
        return new ResponseEntity<>(trackService.createTrack(request), HttpStatus.OK);
    }

    
    @GetMapping
    public ResponseEntity<List<Track>> getAllTracks() {
        return new ResponseEntity<>(trackService.getAllTracks(), HttpStatus.OK);
    }

    
    @GetMapping("/{trackId}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long trackId) {
        return new ResponseEntity<>(trackService.getTrackById(trackId), HttpStatus.OK);
    }

    
    @PutMapping("/{trackId}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long trackId,
                                             @RequestBody TrackRequest request) {
        return new ResponseEntity<>(trackService.updateTrack(trackId, request), HttpStatus.OK);
    }

    
    @DeleteMapping("/{trackId}")
    public ResponseEntity<Void> deleteTrack(@PathVariable Long trackId) {
        trackService.deleteTrack(trackId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}