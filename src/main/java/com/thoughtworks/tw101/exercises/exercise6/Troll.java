package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Will on 12/13/16.
 */
public class Troll implements MonsterInterface {
    private String status;
    private int hitPoints;

    public Troll() {
        hitPoints = 40;
    }

    @Override
    public void takeDamage(int hits) {
        hitPoints = hitPoints - (hits/2);
    }

    @Override
    public String reportStatus() {

        if (hitPoints!= 0){
            status = String.format("Troll is alive with %d hits left", hitPoints);
        }else{
            status = "Troll is dead";
        }

        return status;

    }
}
