package com.google.devrel.training.conference.domain;

/**
 * Created by vlad on 3/28/17.
 */
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
// Get the Memcache Service

public class Announcement {
    private String message;


    public Announcement(){}

    public Announcement(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
