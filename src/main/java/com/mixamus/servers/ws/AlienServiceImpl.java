package com.mixamus.servers.ws;

import com.mixamus.servers.dao.AlienDao;
import com.mixamus.servers.domain.Alien;
import java.util.List;
import javax.jws.WebService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@WebService(endpointInterface = "com.mixamus.servers.ws.AlienService")
public class AlienServiceImpl implements AlienService {

  private AlienDao repository;

  @Override
  public List<Alien> getAllAliens() {
    return repository.findAll();
  }

  @Override
  public Alien getAlienById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public Alien createAlien(Alien name) {
    return repository.save(name);
  }

  @Override
  public void deleteAlienById(Integer id) {
    repository.deleteById(id);
  }

  @Override
  public void updateAlienById(Alien name) {
    Alien.builder()
        .id(name.getId())
        .name(name.getName())
        .color(name.getColor())
        .age(name.getAge())
        .planet(name.getPlanet())
        .build();
  }
}
