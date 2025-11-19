package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.DAO.OrganizacaoService;
import br.com.fiap.gsolution.Model.Organizacao;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.List;

@Path("/organizacoes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrganizacaoResource {

    @Inject
    OrganizacaoService service;

    @GET
    public Response listar() {
        try {
            List<Organizacao> organizacoes = service.listarOrganizacoes();
            return Response.ok(organizacoes).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response cadastrar(Organizacao organizacao) {
        try {
            service.cadastrarOrganizacao(organizacao);
            return Response.status(Response.Status.CREATED).entity(organizacao).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response remover(@PathParam("id") Long id) {
        try {
            service.removerOrganizacao(id);
            return Response.noContent().build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
