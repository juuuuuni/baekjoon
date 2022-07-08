import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int arr[] = new int[n];
        if(n >= 1 && n <= 1000000){
            for(int i = 0; i < n; i++){
                int chk = Integer.parseInt(st.nextToken());
                if(chk >= -1000000 && chk <= 1000000){
                    arr[i] = chk;
                }
            }
            Arrays.sort(arr);   //배열 정렬
            System.out.println(arr[0]);
            System.out.println(arr[n-1]);
        }
    }
    }