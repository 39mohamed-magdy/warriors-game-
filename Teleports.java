package com.java.whistler;

public interface Teleports {
    String teleport();
}
class CanTeleport implements Teleports{
    @Override
    public String teleport() {
        return "Teleports Away";
    }
}
class CantTeleport implements Teleports{
    @Override
    public String teleport() {
        return "Fails at Teleporting";
    }
}
