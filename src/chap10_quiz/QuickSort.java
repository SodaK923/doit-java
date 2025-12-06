package chap10_quiz;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] nums) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
