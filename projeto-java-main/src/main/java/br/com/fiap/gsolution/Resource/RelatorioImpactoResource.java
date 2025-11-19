package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.DAO.RelatorioImpactoService;
import br.com.fiap.gsolution.Model.RelatorioImpacto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.List;

@Path("/relatorios-impacto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RelatorioImpactoResource {

    @Inject
    RelatorioImpactoService service;

    @GET
    public Response listar() {
        try {
            List<RelatorioImpacto> relatorios = service.listarRelatorios();
            return Response.ok(relatorios).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response cadastrar(RelatorioImpacto relatorio) {
        try {
            service.cadastrarRelatorio(relatorio);
            return Response.status(Response.Status.CREATED).entity(relatorio).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response remover(@PathParam("id") Long id) {
        try {
            service.removerRelatorio(id);
            return Response.noContent().build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
