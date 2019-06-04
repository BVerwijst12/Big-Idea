package Objects;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Player wonPlayer;
    private boolean isActive;

    public Game() {

    }

    public boolean setWinner(){
        for (Player player: players
             ) {
            if (player.getAllPokemonHp() <= 0){
                for (Player wonPlayer: players
                     ) {
                    if (wonPlayer.getUsername() != player.getUsername()){
                        this.wonPlayer = wonPlayer;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void endGame(){
        if (setWinner() == true) {
            isActive = false;
        }
    }

}
