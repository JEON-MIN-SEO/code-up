import java.util.Scanner;

public class A1032 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer str = scanner.nextInt();
    scanner.close();

    String hex = Integer.toHexString(str);
    System.out.println(hex);
    }
}
