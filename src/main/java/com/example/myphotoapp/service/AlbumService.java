package com.example.myphotoapp.service;

import com.example.myphotoapp.model.Album;
import com.example.myphotoapp.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

    @Autowired

    private AlbumRepository albumRepository;

    public Album getAlbum(){
        return albumRepository.getAlbum();
    }

}