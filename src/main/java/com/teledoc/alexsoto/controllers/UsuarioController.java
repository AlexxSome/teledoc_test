package com.teledoc.alexsoto.controllers;

import com.teledoc.alexsoto.models.entity.Usuario;
import com.teledoc.alexsoto.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping(value = "/login")
    public Usuario login(@RequestHeader String login, @RequestHeader String password){
        String token = getJWTToken(login);
        Usuario user = new Usuario();
        user = usuarioService.findUsuarioByNombreUsaurioAndPassword(login,password);
        user.setNombreUsuario(login);
        user.setToken(token);

        return user;
    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }

}
