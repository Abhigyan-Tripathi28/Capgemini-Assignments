package com.music.streaming.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;

@RestController
@RequestMapping("music/platform/v1/playlists")
public class PlayListController {

    private final PlayListService playListService;

//    @Autowired
    public PlayListController(PlayListService playListService) {
        this.playListService = playListService;
    }

    @PostMapping
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayListRequest request) {
        return new ResponseEntity<>(playListService.createPlayList(request), HttpStatus.OK);
    }

    @GetMapping("/{playlistId}")
    public ResponseEntity<PlayList> getPlayListById(@PathVariable Long playlistId) {
        return new ResponseEntity<>(playListService.getPlayListById(playlistId), HttpStatus.OK);
    }

    @DeleteMapping("/{playlistId}")
    public ResponseEntity<Void> deletePlayList(@PathVariable Long playlistId) {
        playListService.deletePlayList(playlistId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}