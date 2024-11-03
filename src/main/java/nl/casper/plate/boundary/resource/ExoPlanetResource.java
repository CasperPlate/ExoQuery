package nl.casper.plate.boundary.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import nl.casper.plate.control.service.ExoPlanetService;

import java.io.IOException;

@Path("/import")
public class ExoPlanetResource {

    @Inject
    private ExoPlanetService exoPlanetService;

    @POST
    public Response importExoPlanetsFromJson() {
        try {
            exoPlanetService.importExoPlanetsFromJson();
            return Response.ok("Database is ready for use.").build();
        } catch (final IOException exception) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to import ExoPlanet data.").build();
        }
    }
}
