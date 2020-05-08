package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.dao.IFutbolistaDao;
import com.teledoc.alexsoto.models.entity.Club;
import com.teledoc.alexsoto.models.entity.Futbolista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FutbolistaServiceImpl implements IFutbolistaService{

    @Autowired
    private IFutbolistaDao futbolistaDao;


    @Override
    @Transactional(readOnly = true)
    public List<Futbolista> buscarTodos() {
        return futbolistaDao.findAll();
    }

    @Override
    @Transactional
    public Futbolista guardarFutbolista(Futbolista futbolista) {
        return futbolistaDao.save(futbolista);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Futbolista> futbolistasClub(Club club) {
        return futbolistaDao.findFutbolistaByClub(club);
    }

    @Override
    @Transactional(readOnly = true)
    public Futbolista encontrarFutbolistaId(Integer idFutbolista) {
        return futbolistaDao.findFutbolistaByIdFutbolista(idFutbolista);
    }

}
