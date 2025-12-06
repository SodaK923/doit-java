package chap07_quiz;

public class Alphabets {
    public static void main(String[] args) {
        char[][] arr = new char[13][2];
        char alphabet = 'a';

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++, alphabet++){
                arr[i][j] = alphabet;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
