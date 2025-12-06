package chap10_quiz;

public interface Sort {
    void ascending(int[] nums);
    void descending(int[] nums);
    default void description(){
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    };
}
