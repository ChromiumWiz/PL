package com.ranrasa.playlistServer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Track")
public class Track {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int trackNo;
    
    private String title;
    private String duration;
    private String url;
    
    public int getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(int trackNo) {
        this.trackNo = trackNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Track [trackNo=" + trackNo + ", title=" + title + ", duration=" + duration + ", url=" + url + "]";
    }

}
