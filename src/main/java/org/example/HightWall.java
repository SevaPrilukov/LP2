package org.example;

public enum HightWall {
    LOW(1), STANDART(3), HARD(5);
    private  int height;
    HightWall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
