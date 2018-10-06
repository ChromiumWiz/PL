package com.ranrasa.playlistServer.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    
    @RequestMapping(value = "/", method= RequestMethod.GET,produces = "text/plain")
    public String home(){
        return "Springboot ;)";
    }

    @RequestMapping("/_ah/health")
    public String healthy() {
      // Message body required though ignored
      return "Still surviving.";
    }

}
