import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        try {
            while (true) {
                int x = s.nextInt();
                if (x == max) {
                    cnt++;
                }
                if (x > max) {
                    max = x;
                    cnt = 1;
                }
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }
        System.out.println(cnt);
    }    
}
