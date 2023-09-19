package org.example;

public enum LengthRoad {
    LOW(100), STANDART(300), HARD(500);
    private  int length;
    LengthRoad(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
