package com.ranrasa.playlistServer.services;

import java.util.List;
import com.ranrasa.playlistServer.models.Track;

public interface PlaylistService {
    
    Iterable<Track> getCurrentPlaylist();
    
    void saveTrack (Track track);

}
