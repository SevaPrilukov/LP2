package org.example;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Robot("Робот 1", 300,2),
                new Robot("Робот 2", 200,1),
                new Robot("Робот 3", 800,3),
                new Robot("Робот 4", 800,0),
                new Human("Ваня", 100,1),
                new Cat("Барсик", 150,2)
        };
        Trials[] trials = {
                //new Wall(HightWall.HARD),
                //new Wall(HightWall.HARD),
                new Wall(HightWall.HARD),
                new Road(LengthRoad.LOW),
                new Wall(HightWall.STANDART),
                new Road(LengthRoad.STANDART),
                new Road(LengthRoad.HARD),
                new Wall(HightWall.LOW),
                new Wall(HightWall.HARD),
                new Road(LengthRoad.LOW)
        };
        for (Participant P: participants){
            for (Trials R: trials){
                if (!R.smog(P)) break;
            }
        }
    }
}