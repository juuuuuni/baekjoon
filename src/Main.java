import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        String str = "";
        for(int i = 0; i < n; i ++) {
            int a = Integer.parseInt(st2.nextToken());
            if(a < x){
                str += a + " ";
            }
        }
        System.out.println(str.substring(0, (str.length() - 1)));
        }
    }