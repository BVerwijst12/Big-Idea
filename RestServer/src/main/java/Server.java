import RestApi.PokemonService;
import RestApi.UserService;
import spark.Spark;

public class Server {

    public static void Main(String[] Args){
        Spark.ipAddress("localhost");
        new UserService();
        new PokemonService();
    }
}
