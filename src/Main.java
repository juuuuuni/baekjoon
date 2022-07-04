import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());    //입력받는 곳.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a > 0 && b < 10){
                 bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " +(a + b) + "\n");
        }
        }
        bw.flush();
    }
}