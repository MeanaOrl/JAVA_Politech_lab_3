import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int tap = Integer.MIN_VALUE;
        int cnt = 1;
        try {
            while (true) {
                int x = s.nextInt();
                if (x == tap) {
                    cnt++;
                }
                if (x != tap) {
                    if (cnt > max) {
                        max = cnt;
                    }
                    tap = x;
                    cnt = 1;
                }
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }
        System.out.println(max);
    }    
}
