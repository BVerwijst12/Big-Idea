package RestApi;

import DAL.MySqlContext.UserMySqlContext;
import com.google.gson.Gson;

import Requests.RegisterRequestDto;
import Responses.RegisterResponseDto;

import static spark.route.HttpMethod.*;
import static spark.Spark.*;


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
