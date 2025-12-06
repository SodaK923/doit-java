package tdd;

public class AdvancedLevel extends PlayerLevel {

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
        System.out.println("turn 불가한 레벨입니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급레벨");
    }
}
