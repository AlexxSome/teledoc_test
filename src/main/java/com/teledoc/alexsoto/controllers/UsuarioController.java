package com.teledoc.alexsoto.controllers;

import com.teledoc.alexsoto.models.entity.Usuario;
import com.teledoc.alexsoto.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping(value = "/login")
    public Usuario login(@RequestHeader String login, @RequestHeader String password){
        return usuarioService.findUsuarioByNombreUsaurioAndPassword(login,password);
    }

}
