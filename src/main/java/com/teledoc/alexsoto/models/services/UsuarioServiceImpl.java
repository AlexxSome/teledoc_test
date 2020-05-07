package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Override
    public List<Usuario> findAll() {
        return null;
    }
}
