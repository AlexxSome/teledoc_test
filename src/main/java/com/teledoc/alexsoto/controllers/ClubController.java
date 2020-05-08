package com.teledoc.alexsoto.controllers;

import com.teledoc.alexsoto.models.entity.Club;
import com.teledoc.alexsoto.models.services.IClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClubController {

    @Autowired
    private IClubService clubService;

    @GetMapping(value = "/clubes")
    public List<Club> listarClubes(){
        return clubService.listarClubes();
    }
}
