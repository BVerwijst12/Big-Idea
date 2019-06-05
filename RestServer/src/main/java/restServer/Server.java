package restServer;

import RestApi.PokemonService;
import RestApi.UserService;
import spark.Spark;

public class Server {

    public static void main(String[] args) {
        Spark.ipAddress("localhost");
        UserService userService = new UserService();
        PokemonService pokemonService = new PokemonService();
    }
}
