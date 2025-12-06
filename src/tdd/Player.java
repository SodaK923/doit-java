package tdd;

public class Player {
    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
        System.out.println("생성자");
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
        System.out.println("업그레이드");
    }

    public void play(int count){
        level.go(count);
    }
}
