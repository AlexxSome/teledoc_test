package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.entity.Club;
import com.teledoc.alexsoto.models.entity.Futbolista;

import java.util.List;

public interface IFutbolistaService {
    public List<Futbolista> buscarTodos();

    public Futbolista guardarFutbolista(Futbolista futbolista);

    public List<Futbolista> futbolistasClub(Club club);

    public Futbolista encontrarFutbolistaId(Integer idFutbolista);

}
