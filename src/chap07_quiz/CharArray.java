package chap07_quiz;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i=0; i<alphabets.length; i++, ch++){
            alphabets[i] = (char)(ch+32);
        }

        for(int i=0; i<alphabets.length; i++){
            System.out.println(alphabets[i]+","+(int)alphabets[i]);
        }
    }
}
