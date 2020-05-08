package com.teledoc.alexsoto.controllers;

import com.teledoc.alexsoto.models.entity.Club;
import com.teledoc.alexsoto.models.entity.Futbolista;
import com.teledoc.alexsoto.models.services.IClubService;
import com.teledoc.alexsoto.models.services.IFutbolistaService;
import com.teledoc.alexsoto.utils.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class FutbolistaController {

    @Autowired
    private IFutbolistaService futbolistaService;

    @Autowired
    private IClubService clubService;

    @GetMapping(value = "/futbolistas")
    public List<Futbolista> futbolistaList(){
        return futbolistaService.buscarTodos();
    }

    @PostMapping(value = "/futbolistas")
    @ResponseStatus(HttpStatus.CREATED)
    public Futbolista crearFutbolista(@RequestBody Futbolista f, @RequestHeader Integer idClub){
        Club clubFut = clubService.encontrarClub(idClub);
        if(null != clubFut){
            f.setClub(clubFut);
            return futbolistaService.guardarFutbolista(f);
        }else{
            new NotFoundException("Club no encontrado");
            return null;
        }
    }

    @GetMapping(value = "/{id}")
    public Set<Futbolista> futbolistasClub(@PathVariable Integer id){
        Club club = clubService.encontrarClub(id);
        if(null != club){
             Set<Futbolista> lista = club.getFutbolistaList();
             return lista;
        }else{
            new NotFoundException("Club no encontrado");
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public Futbolista eliminarFutbolistaClub(@PathVariable Integer id){
        Futbolista f = futbolistaService.encontrarFutbolistaId(id);



        if(null == f){
            new NotFoundException("Futbolista no encontrado");
            return new Futbolista();
        }else{
            f.setClub(null);
        }

        return futbolistaService.guardarFutbolista(f);
    }


}
