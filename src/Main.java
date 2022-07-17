import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        if(sentence.length() <= 1000000) {
            if(!sentence.equals(" ")) {
                String[] wordCount = sentence.trim().split(" ");
                System.out.println(wordCount.length);
            }else{
                System.out.println(0);
            }
        }
    }
}