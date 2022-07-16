import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n >= 1 && n <= 1000){
            System.out.println(x(n));
        }

    }

    public static int x(int n) {
        ArrayList<Integer> han = new ArrayList<Integer>();
        if(n < 100) {
            for (int i = 0; i < n; i++) {
                han.add(i + 1);
            }
        }else {
            for (int i = 0; i < 99; i++) {
                han.add(i + 1);
            }
            for (int k = 100; k <= n; k++) {
                ArrayList<Integer> ten = new ArrayList<Integer>();
                int a = k;
                while (a > 0) {
                    ten.add(a % 10);
                    a /= 10;
                }
                int chk = ten.get(1) - ten.get(0);
                if (ten.size() == 3) {
                    if ((ten.get(2) - ten.get(1)) == chk) {
                        han.add(n);
                    }
                }
            }
        }
        return han.size();
    }
    }

