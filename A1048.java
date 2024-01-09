import java.util.Scanner;

public class A1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*Math.pow(2, b)); // a<<b
        scanner.close();
    }
}
