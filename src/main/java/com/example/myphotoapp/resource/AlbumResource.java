package com.example.myphotoapp.resource;


import com.example.myphotoapp.model.Album;
import com.example.myphotoapp.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/Album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }

}
