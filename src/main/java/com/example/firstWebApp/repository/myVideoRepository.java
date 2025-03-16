package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.myVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface myVideoRepository extends JpaRepository<myVideo,Long> {
}
