package Objects;

public class Move {
    private String name;
    private int damage;
    private boolean isSpecial;

    public Move(String name, int damage, boolean isSpecial) {
        this.name = name;
        this.damage = damage;
        this.isSpecial = isSpecial;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isSpecial() {
        return isSpecial;
    }
}
