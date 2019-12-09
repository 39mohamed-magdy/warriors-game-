package com.java.whistler;

import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        // write your code here
      Warrior thor = new Warrior("Thor", 800,
              135, 40);
      Warrior loki = new DodgeWarrior("Loki", 800,
              85, 40, .25);
      Battle.startFight(thor, loki);

        System.out.println("Loki " + loki.teleport());
        loki.setTeleportAbility(new CanTeleport());
        System.out.println("Loki " + loki.teleport());

    }
}

