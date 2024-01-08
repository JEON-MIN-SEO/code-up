import java.util.Scanner;

public class A1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //分け前
        System.out.println(a%b); //残り
        double d = (double)a/b;

        System.out.printf("%.2f", d);
    }
}
