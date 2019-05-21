public class Elo {
    public double CalcWinPropability(Player playerOne, Player playerTwo){
        double probability = 1 / (1 + Math.pow(10, (float)(playerTwo.getEloRating() - playerOne.getEloRating())/ 400));
        return probability;
    }

    public double calcNewEloRating(double winProp, boolean hasWon, Player playerOne){
        double expectedScore;
        double actualScore;
        if (winProp < 0.5){
            expectedScore = 0;
        }
        else if (winProp > 0.5){
            expectedScore = 1;
        }
        else {
            expectedScore = 0.5;
        }

        if (hasWon && winProp < 0.25){
            actualScore = 3;
        }
        else if (hasWon && winProp < 0.40){
            actualScore = 2;
        }
        else if (hasWon && winProp > 0.5){
            actualScore = 1;
        }
        else {
            actualScore = 0;
        }

        return playerOne.getEloRating() + 32 * (actualScore - expectedScore);
    }
}
