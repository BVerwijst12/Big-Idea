package RestApi;

import DAL.MySqlContext.UserMySqlContext;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.Requests.RegisterRequestDto;
import java.Responses.RegisterResponseDto;

import static spark.route.HttpMethod.*;


public class UserService {

    private final static Gson gson = new Gson();

    public UserService(){
        UserMySqlContext userMySqlContext = new UserMySqlContext();
        post("/UserService/addUser", (request, response) -> {
            RegisterRequestDto registerRequestDto = gson.fromJson(request.body(), RegisterRequestDto.class);
            if (userMySqlContext.addUser(registerRequestDto.getUsername(), registerRequestDto.getPassword())){
                RegisterResponseDto registerResponseDto = new RegisterResponseDto(registerRequestDto.getUsername(), true);
                String result = gson.toJson(registerResponseDto);
                return result;
            }
            else{
                return new RegisterResponseDto("", false);
            }
        });
    }

}
