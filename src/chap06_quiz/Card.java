package chap06_quiz;

public class Card {
    private static int serialNum = 1000;
    private int cardID;
    private String name;

    private static Card instance;

    private Card(){
        serialNum++;
        cardID = serialNum;
    }

    public static Card getInstance(){
        if (instance == null){
            instance = new Card();
        }
        return instance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
