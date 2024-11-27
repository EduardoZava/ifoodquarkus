package com.ezava.ifood.cadastro.entity;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.transaction.Transactional;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.DELETE;

@Path("/restaurantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteResources {

        @GET
        public List<Restaurante> getRestaurantes() {
            return Restaurante.listAll();
        }

        @POST
        @Transactional
        @Produces(MediaType.APPLICATION_JSON)
        public void incluirRestarante(Restaurante dto) {
            dto.persist();
        }

        @PUT
        @Path("{id}")
        @Transactional
        public void updateRestaurante(@PathParam("id") Long id, Restaurante dto) {
            Restaurante entity = Restaurante.findById(id);
            entity.nome = dto.nome;
            entity.persist();
        }

        @DELETE
        @Path("{id}")
        @Transactional
        public void deleteRestaurante(@PathParam("id") Long id) {
            Restaurante entity = Restaurante.findById(id);
            entity.delete();
        }




}
