package Dto;

import java.util.ArrayList;

public class PokemonDto {

    private String name;
    private int healthPoints;
    private int attack;
    private int spAttack;
    private int defence;
    private int spDefence;
    private int speed;

    public PokemonDto(String name, int healthPoints, int attack, int spAttack, int defence,
                   int spDefence, int speed) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.spAttack = spAttack;
        this.defence = defence;
        this.spDefence = spDefence;
        this.speed = speed;
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
}
