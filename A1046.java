import java.util.Scanner;

public class A1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a+b+c);
        double sum = (a+b+c)/3.0;
        System.out.printf("%.1f",sum);
        scanner.close();
    }
}
