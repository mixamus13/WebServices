package com.mixamus.servers;

import com.mixamus.servers.ws.AlienServiceImpl;
import javax.xml.ws.Endpoint;

public class AlienMain {

  public static void main(String[] args) {

    Endpoint.publish("http://localhost:7878/com.mixamus/servers/service", AlienServiceImpl.class);
    System.out.println("Done");
  }

}
