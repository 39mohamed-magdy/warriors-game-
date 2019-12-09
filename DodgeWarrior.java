package com.java.whistler;

import java.util.Random;

public class DodgeWarrior extends Warrior {
    double dodgePrecent;
    Random rand = new Random();
    public DodgeWarrior(String name, int health, int attKMax,
                        int blockMax, double dodgePrecent) {
        super(name, health, attKMax, blockMax);
        this.dodgePrecent = dodgePrecent;
        teleportsType = new CanTeleport();
    }

    public int block(){
        double chance = rand.nextDouble();
        if (chance <= dodgePrecent){
            System.out.printf("%s Dodge the Attack\n\n"
                    , this.getName());
            return 10000;
        }else{
            return 1 + (int)(Math.random() * ((blockMax - 1 ) + 1));
        }
    }
}
