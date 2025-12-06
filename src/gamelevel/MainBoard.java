package gamelevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player(); // BeginnerLevel로 시작
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        PlayerLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
