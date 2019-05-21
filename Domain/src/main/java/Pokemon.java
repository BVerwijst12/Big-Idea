import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int healthPoints;
    private int attack;
    private int spAttack;
    private int defence;
    private int spDefence;
    private int speed;
    private boolean isFainted;
    private ArrayList<Move> moveSet;
    private Type type;

    public Pokemon(String name, int healthPoints, int attack, int spAttack, int defence,
                   int spDefence, int speed, ArrayList<Move> moveSet, Type type) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.spAttack = spAttack;
        this.defence = defence;
        this.spDefence = spDefence;
        this.speed = speed;
        this.moveSet = moveSet;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpDefence() {
        return spDefence;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFainted() {
        return isFainted;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public Type getType() {
        return type;
    }
}
