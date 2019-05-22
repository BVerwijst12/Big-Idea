package RestApi;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/UserService")
public class UserService {

    private final static Gson gson = new Gson();

    @POST
    @Path("/AddUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(){

    }
}
