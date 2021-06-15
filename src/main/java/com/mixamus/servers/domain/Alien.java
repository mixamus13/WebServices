package com.mixamus.servers.domain;

import javax.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Alien {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String color;
  private int age;
  private String planet;
}
