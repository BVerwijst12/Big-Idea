package RestApi;

import DAL.MySqlContext.PokemonMySqlContext;
import com.google.gson.Gson;

import Dto.PokemonDto;
import java.util.ArrayList;

import static spark.Spark.*;


import static spark.route.HttpMethod.*;

public class PokemonService {
    private final static Gson gson = new Gson();


    public PokemonService(){
        PokemonMySqlContext pokemonMySqlContext = new PokemonMySqlContext();
        get("/PokemonService/getAllPokemons", (request, response) -> {

            ArrayList<PokemonDto> allPokemons = pokemonMySqlContext.getAllPokemons();
            String output = gson.toJson(allPokemons);
            return output;
        });
    }
}
