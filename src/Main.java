import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n > 0 && n <= 100000){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i = n; i > 0; i--){
                 bw.write(i + "\n");
            }
            bw.flush();
        }
    }
}