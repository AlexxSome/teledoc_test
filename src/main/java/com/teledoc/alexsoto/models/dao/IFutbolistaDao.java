package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFutbolistaDao extends JpaRepository<Futbolista, Integer> {

}
