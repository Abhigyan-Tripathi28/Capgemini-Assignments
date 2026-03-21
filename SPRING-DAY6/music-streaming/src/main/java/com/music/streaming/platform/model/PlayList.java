package com.music.streaming.platform.model;

import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "play_list")
public class PlayList extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long id;

    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
        name = "playlist_contains_track",
        joinColumns = @JoinColumn(name = "playlist_id"),
        inverseJoinColumns = @JoinColumn(name = "track_id")
    )
    private List<Track> tracks;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}