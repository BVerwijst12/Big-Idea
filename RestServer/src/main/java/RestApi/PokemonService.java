package RestApi;

import com.google.gson.Gson;

import static spark.Spark.*;


import static spark.route.HttpMethod.*;

public class PokemonService {
    private final static Gson gson = new Gson();

    public PokemonService(){
        get("/PokemonService/getAllPokemons", (request, response) -> {
            String body = request.body();

        });
    }
}
