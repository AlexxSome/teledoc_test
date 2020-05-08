package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClubDao extends JpaRepository<Club, Integer> {
    public Club findByIdClub(Integer idClub);
}
