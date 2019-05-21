import java.util.ArrayList;

public class Player {
    private String username;
    private int eloRating;
    private ArrayList<Pokemon> pokemons;
    private Pokemon activePokemon;

    public Player(String username, int eloRating){
        this.username = username;
        this.eloRating = eloRating;
    }

    public String getUsername() {
        return username;
    }

    public int getEloRating() {
        return eloRating;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public Pokemon getActivePokemon() {
        return activePokemon;
    }
}
