package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.Model.Habilidade;
import br.com.fiap.gsolution.DAO.HabilidadeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/habilidades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HabilidadeResource {

    @Inject
    HabilidadeService service;

    @GET
    public Response listar() {
        try {
            List<Habilidade> habilidades = service.listarHabilidades();
            return Response.ok(habilidades).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response cadastrar(Habilidade habilidade) {
        try {
            service.cadastrarHabilidade(habilidade);
            return Response.status(Response.Status.CREATED).entity(habilidade).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response remover(@PathParam("id") Long id) {
        try {
            service.removerHabilidade(id);
            return Response.noContent().build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
