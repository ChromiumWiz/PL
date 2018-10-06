package com.ranrasa.playlistServer.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ranrasa.playlistServer.models.Track;
import com.ranrasa.playlistServer.dao.PlaylistRepository;

@Component
public class PlaylistServiceImpl implements PlaylistService {
    
    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public Iterable<Track> getCurrentPlaylist() {
        return playlistRepository.findAll();
    }
    
    @Override
    public void saveTrack ( Track track) {
        
        playlistRepository.save(track);
    }
}
