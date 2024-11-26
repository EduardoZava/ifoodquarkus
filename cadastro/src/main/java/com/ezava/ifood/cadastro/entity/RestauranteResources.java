package com.ezava.ifood.cadastro.entity;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restaurantes")
public class RestauranteResources {

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Restaurante> getRestaurantes() {
            return Restaurante.listAll();
        }


}
