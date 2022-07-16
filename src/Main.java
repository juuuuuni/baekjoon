import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> selfnumber = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i++){
             selfnumber.add(Integer.toString(i + 1));
        }
        for(int k = 0; k < 10000; k++){
            int sum = d(k + 1);
            selfnumber.remove(Integer.toString(sum));
        }
        for(int n = 0; n < selfnumber.size(); n++){
            System.out.println(selfnumber.get(n));
        }
    }
    public static int d(int n){
        int sum = n;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    }

