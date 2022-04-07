package edu.poniperro.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bye")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "<img src='https://images.vexels.com/media/users/3/150997/isolated/preview/76d7b2457f16f4aa11b77d8926e48ff8-bandera-del-corazon-gay-by-vexels.png' width=15%>"
                +
                "<h1>Jorge guapo</h1>" +
                "<h2>Chema tu tambien</h2>";
    }

}