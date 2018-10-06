package com.ranrasa.playlistServer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ranrasa.playlistServer.models.Track;

@Repository
public interface PlaylistRepository extends CrudRepository<Track,Integer> {
     
}
