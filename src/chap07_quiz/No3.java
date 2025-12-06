package chap07_quiz;

public class No3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int total = 0;

        int index = 0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
                arr[index]=i;
                index++;
            }
        }

        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }

        System.out.println(total);
    }
}
