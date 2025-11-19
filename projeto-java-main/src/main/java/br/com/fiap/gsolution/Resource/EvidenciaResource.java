package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.DAO.EvidenciaService;
import br.com.fiap.gsolution.Model.Evidencia;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.List;

@Path("/evidencias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EvidenciaResource {

    @Inject
    EvidenciaService service;

    @GET
    public Response listar() {
        try {
            List<Evidencia> evidencias = service.listarEvidencias();
            return Response.ok(evidencias).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response cadastrar(Evidencia evidencia) {
        try {
            service.cadastrarEvidencia(evidencia);
            return Response.status(Response.Status.CREATED).entity(evidencia).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response remover(@PathParam("id") Long id) {
        try {
            service.removerEvidencia(id);
            return Response.noContent().build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
