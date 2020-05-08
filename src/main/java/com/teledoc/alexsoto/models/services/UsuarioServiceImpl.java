package com.teledoc.alexsoto.models.services;

import com.teledoc.alexsoto.models.dao.IUsuarioDao;
import com.teledoc.alexsoto.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUsuarioByNombreUsaurioAndPassword(String nombreUsuario, String password) {
        return usuarioDao.findUsuarioByNombreUsuarioAndPassword(nombreUsuario, password);
    }
}
