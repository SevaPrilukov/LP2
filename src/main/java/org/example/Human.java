package org.example;

public class Human implements Participant{
    protected String name;
    private final int maxRun;
    private final int maxJump;
    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public boolean run(int distance){
        if (distance <= maxRun){
            System.out.println(this.name + " пробежал " + distance + " м");
            return true;
        }else {
            System.out.println(this.name + " не может пробежать " + distance + " м" + "| выбывавет");
            return false;
        }
    }

    @Override
    public boolean jump(int height){
        if (height <= maxJump){
            System.out.println(this.name + " перепрыгнул " + height + " м");
            return true;
        }else {
            System.out.println(this.name + " не перепрыгнул " + height + " м" + "| выбывавет");
            return false;
        }
    }
}
