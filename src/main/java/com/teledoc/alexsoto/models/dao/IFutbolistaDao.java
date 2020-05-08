package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Club;
import com.teledoc.alexsoto.models.entity.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFutbolistaDao extends JpaRepository<Futbolista, Integer> {
    public List<Futbolista> findFutbolistaByClub(Club club);

    public Futbolista findFutbolistaByIdFutbolista(Integer idFutbolista);
}
