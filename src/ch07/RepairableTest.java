package ch07;

public class RepairableTest {
}

interface Repairable{}

class Unit{
    int hitPoint;
    final int MAX_HP;
    public Unit(int hp) {
        this.MAX_HP = hp;
    }
}

class GroundUnit extends Unit {
    public GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    public AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
}