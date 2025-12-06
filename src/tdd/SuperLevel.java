package tdd;

import java.sql.SQLOutput;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }

    @Override
    public void turn() {
        System.out.println("turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급레벨");
    }
}
