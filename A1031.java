import java.util.Scanner;

public class A1031 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer str = scanner.nextInt();

    String oct = Integer.toOctalString(str);
    System.out.println(oct);
    }
}
