package org.example;

public class Robot implements Participant, Robot_inter{
    protected String name;
    private final int maxRun;
    private final int maxJump;
    public static int abilityCount = 3;
    public Robot(String name, int maxRun, int maxJump) {
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
        }else if(abilityCount !=0){
            System.out.println(this.name + superJump());
            abilityCount--;
            return true;
        }
        else {
            System.out.println(this.name + " не перепрыгнул " + height + " м" + "| выбывавет");
            return false;
        }
    }

    //public boolean superJump(){
        //System.out.println(this.name + " перепрыгнул с помощью способности");
        //abilityCount--;
        //return true;
    //}
}
