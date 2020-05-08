package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();

    public Usuario findUsuarioByNombreUsaurioAndPassword(String nombreUsuario, String password);
}
