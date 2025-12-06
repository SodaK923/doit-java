package singleton_prc;

public class ScoreManagerTest {
    public static void main(String[] args) {
        ScoreManager sm1 = ScoreManager.getInstance();
        sm1.addScore(100);

        ScoreManager sm2 = ScoreManager.getInstance();
        sm2.addScore(50);

        System.out.println(sm1.getScore());
    }
}
