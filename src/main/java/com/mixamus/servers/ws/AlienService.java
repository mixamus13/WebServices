package com.mixamus.servers.ws;

import com.mixamus.servers.domain.Alien;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AlienService {

  @WebMethod
  List<Alien> getAllAliens();

  @WebMethod
  Alien getAlienById(Integer id);

  @WebMethod
  Alien createAlien(Alien name);

  @WebMethod
  void deleteAlienById(Integer id);

  @WebMethod
  void updateAlienById(Alien name);
}
