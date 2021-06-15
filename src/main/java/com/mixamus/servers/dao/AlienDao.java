package com.mixamus.servers.dao;

import com.mixamus.servers.domain.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienDao extends JpaRepository<Alien, Integer> {

}
