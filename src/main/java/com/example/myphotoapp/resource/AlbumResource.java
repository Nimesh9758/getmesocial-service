package com.example.myphotoapp.resource;


import com.example.myphotoapp.model.Album;
import com.example.myphotoapp.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/Album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }

    @PostMapping("/Album")
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @GetMapping("/AllAlbum")
    public List<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/Album/(AlbumId)")
    public Album getAlbumByID(@PathVariable("albumID") int albumId){
        return albumService.getAlbumById(albumId);
    }

    @PutMapping("/Album/(AlbumId)")
    public Album updateAlbum(@PathVariable("albumID") int albumId, @RequestBody Album album){
        return albumService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/Album")
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    }
}
