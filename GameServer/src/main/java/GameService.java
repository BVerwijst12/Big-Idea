public class GameService {

    public int calcDamage(Pokemon pokemonOne, Pokemon pokemonTwo, Move move){
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
}
