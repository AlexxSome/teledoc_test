package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.dao.IClubDao;
import com.teledoc.alexsoto.models.entity.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClubServiceImpl implements IClubService{

    @Autowired
    private IClubDao clubDao;

    @Override
    @Transactional(readOnly = true)
    public List<Club> listarClubes() {
        return clubDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Club encontrarClub(Integer idClub) {
        return clubDao.findByIdClub(idClub);
    }
}
