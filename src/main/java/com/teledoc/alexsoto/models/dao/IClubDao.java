package com.teledoc.alexsoto.models.dao;

import com.teledoc.alexsoto.models.entity.Club;
import org.springframework.data.repository.CrudRepository;

public interface IClubDao extends CrudRepository<Club, Integer> {

}
