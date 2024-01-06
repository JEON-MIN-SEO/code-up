import java.util.Scanner;

public class A1034 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer str = scanner.nextInt();
    scanner.close();

    String hex = Integer.toHexString(str);
    String upHex = hex.toUpperCase();
    System.out.println(upHex);
    }
}
