import static spark.Spark.*;

public class RestTest {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
