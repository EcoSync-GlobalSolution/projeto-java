package br.com.fiap.gsolution.Resource;

import br.com.fiap.gsolution.Model.UsuarioHabilidade;
import br.com.fiap.gsolution.DAO.UsuarioHabilidadeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/usuarios/{usuarioId}/habilidades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioHabilidadeResource {

    @Inject
    UsuarioHabilidadeService service;

    @GET
    public Response listar(@PathParam("usuarioId") Long usuarioId) {
        try {
            List<UsuarioHabilidade> lista = service.listarPorUsuario(usuarioId);
            return Response.ok(lista).build();
        } catch (SQLException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response adicionar(@PathParam("usuarioId") Long usuarioId, UsuarioHabilidade usuarioHabilidade) {
        try {
            usuarioHabilidade.setUsuarioId(usuarioId);
            service.adicionarHabilidade(usuarioHabilidade);
            return Response.status(Response.Status.CREATED).entity(usuarioHabilidade).build();
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

