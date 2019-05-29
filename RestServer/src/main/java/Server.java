import RestApi.PokemonService;
import RestApi.UserService;
import spark.Spark;

public class Server {


    public static void main(String[] args) {
        Spark.ipAddress("localhost");
        new UserService();
        new PokemonService();
    }
}
