package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {

}
