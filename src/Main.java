import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean chk = true;
        int cycle = 0;
        if(n >= 0 && n <= 99) {
            String a = "";
            if(n < 10){
                a = String.format("%02d",n);
            }else {
                a = Integer.toString(n);
            }
            while (chk) {
                String b = a.substring(0,1);
                String c = a.substring(1,2);
               int i = Integer.parseInt(b) + Integer.parseInt(c);
               if(i < 10){
                   a = String.format("%02d",i);
               }else {
                   a = Integer.toString(i);
                }
               String d = a.substring(1,2);
               a = c + d;
               cycle++;
               if(Integer.parseInt(a) == n){
                   chk = false;
               }
            }
            System.out.println(cycle);
        }
    }
    }