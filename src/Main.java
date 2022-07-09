import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(a >= 100 && a < 1000 && b >= 100 && b < 1000 && c >= 100 && c < 1000){
            String str = Integer.toString(a * b * c);
            String arr[] = str.split("");
            int chk = 0;
            for(int i = 0; i < 10; i++){
                for(int k = 0; k < arr.length; k++){
                    if(i == Integer.parseInt(arr[k])){
                        chk++;
                    }
                }
                System.out.println(chk);
                chk = 0;
            }
        }
    }
    }