import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int su = 0;
        int del = 0;
        try {
            while (true) {
                int x = s.nextInt();
                if (x % 2 == 0) {
                    su += x;
                    del++;
                }
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }
        System.out.println(su/del);
    }
}
