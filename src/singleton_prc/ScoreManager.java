package singleton_prc;

public class ScoreManager {
    private int score=0;

    private static ScoreManager scoreManager;
    private ScoreManager(){}

    public static ScoreManager getInstance(){
        if(scoreManager==null){
            scoreManager = new ScoreManager();
        }
        return scoreManager;
    }

    public void addScore(int score){
        this.score+=score;
    }

    public int getScore(){
        return score;
    }
}
