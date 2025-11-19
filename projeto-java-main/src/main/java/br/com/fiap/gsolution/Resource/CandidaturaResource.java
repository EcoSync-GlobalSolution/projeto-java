package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.Model.Candidatura;
import br.com.fiap.gsolution.DAO.CandidaturaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/candidaturas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidaturaResource {

    @Inject
    CandidaturaService service;

    @GET
    public Response listar() {
        try {
            List<Candidatura> candidaturas = service.listarCandidaturas();
            return Response.ok(candidaturas).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response cadastrar(Candidatura candidatura) {
        try {
            service.cadastrarCandidatura(candidatura);
            return Response.status(Response.Status.CREATED).entity(candidatura).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response remover(@PathParam("id") Long id) {
        try {
            service.removerCandidatura(id);
            return Response.noContent().build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}

