package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.entity.Club;

import java.util.List;

public interface IClubService {
    public List<Club> listarClubes();

    public Club encontrarClub(Integer idClub);
}
