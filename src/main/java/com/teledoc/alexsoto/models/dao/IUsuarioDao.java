package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {

}
