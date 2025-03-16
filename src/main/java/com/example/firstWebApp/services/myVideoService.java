package com.example.firstWebApp.services;

import com.example.firstWebApp.entities.myVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.firstWebApp.repository.myVideoRepository;

import java.util.List;

@Service
public class myVideoService {

    @Autowired
    private myVideoRepository myVideoRepository;

    public myVideoService(myVideoRepository myVideoRepository) {

        this.myVideoRepository = myVideoRepository;
    }
    public myVideo addVideo(myVideo video)
    {
        return this.myVideoRepository.save(video);
    }
    public List<myVideo> getAll()
    {
        return this.myVideoRepository.findAll();
    }
}
