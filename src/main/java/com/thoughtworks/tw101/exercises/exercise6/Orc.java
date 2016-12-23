package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements MonsterInterface {
   private int hitPoints;
    private String status;

    public Orc() {
         hitPoints = 20;
    }
    @Override
    public void takeDamage(int hits) {
       hitPoints = hitPoints - hits;
    }
    @Override
    public String reportStatus() {
     if (hitPoints!= 0){
        status = String.format("Orc is alive with %d hits left", hitPoints);
     }else{
         status = "Orc is dead";
        }

        return status;
    }
}
