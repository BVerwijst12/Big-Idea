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


    public ArrayList<Pokemon> getRandomTeam(){
        ArrayList<Pokemon> randomTeam = new ArrayList();
        for (int i = 0; i < 6; i++) {
            // get pokemon from db
        }
        return randomTeam;
    }

    public void attack(Pokemon activePokemon, Pokemon opponentPokemon, Move move){
        int calculatedDamage = calcDamage(activePokemon, opponentPokemon, move);
        opponentPokemon.removeHP(calculatedDamage);
    }

    private int calcDamage(Pokemon pokemonOne, Pokemon pokemonTwo, Move move){
        if (move.isSpecial()){
            int spAttack = pokemonOne.getSpAttack();
            int spDefence = pokemonTwo.getSpDefence();

            int damage = (spAttack/spDefence) * move.getDamage();
            return damage;
        }

        int attack = pokemonOne.getAttack();
        int defence = pokemonTwo.getDefence();

        int damage = (attack / defence) * move.getDamage();

        return damage;
    }

    public int getAllPokemonHp(){
        int allHp = 0;
        for (Pokemon pokemon: pokemons
             ) {
            allHp =allHp + pokemon.getHealthPoints();
        }
        return allHp;
    }

    public void switchPokemon(Pokemon pokemon){
        activePokemon = pokemon;
    }

}
