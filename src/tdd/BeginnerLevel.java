package tdd;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void jump() {
        System.out.println("jump 불가한 레벨입니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 불가한 레벨입니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초급레벨");
    }
}
