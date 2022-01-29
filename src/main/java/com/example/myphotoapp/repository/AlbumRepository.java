package com.example.myphotoapp.repository;

import com.example.myphotoapp.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album(1,"Nimesh", "ALbum", "www.google.com");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumID(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbum() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumID() == albumId){
                return album;
            }
        }
        return  null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a:albumList){
            if(a.getAlbumID() == albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album a:albumList){
            if(a.getAlbumID() == albumId) {
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
