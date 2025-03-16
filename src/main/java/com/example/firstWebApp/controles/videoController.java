package com.example.firstWebApp.controles;

import com.example.firstWebApp.entities.myVideo;
import com.example.firstWebApp.services.myVideoService;
import com.example.firstWebApp.services.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class videoController {
    @Autowired
    private myVideoService videoService;
    @PostMapping("/video/save")
    public myVideo addVideo(@RequestBody myVideo v)
    {
       return this.videoService.addVideo(v);
    }
    @GetMapping("/getAll")
    public List<myVideo>getAll()
    {
        return this.videoService.getAll();
    }

}
