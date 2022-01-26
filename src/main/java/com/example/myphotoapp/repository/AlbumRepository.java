package com.example.myphotoapp.repository;

import com.example.myphotoapp.model.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepository {
    public Album getAlbum(){
        Album album = new Album(1,"Nimesh", "ALbum", "www.google.com");
        return album;
    }
}
