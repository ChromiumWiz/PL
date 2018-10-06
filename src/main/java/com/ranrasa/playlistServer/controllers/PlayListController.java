package com.ranrasa.playlistServer.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ranrasa.playlistServer.models.Track;
import com.ranrasa.playlistServer.services.PlaylistService;

@RestController
@RequestMapping("/playlist")
public class PlayListController {
    
    @Autowired
    private PlaylistService playlistService;
    
    @RequestMapping(value = "/", method= RequestMethod.GET,produces = "application/json")
    public Iterable<Track> getPlayList(){
        return playlistService.getCurrentPlaylist();
    }
    
    @RequestMapping(value = "/", method= RequestMethod.POST,produces = "application/json")
    public void saveTrack(@RequestBody Track track){
        playlistService.saveTrack(track);
    }

}
