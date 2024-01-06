import java.util.Scanner;

public class A1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexString = scanner.nextLine();

        int hex = Integer.parseInt(hexString, 16);
        String octNum = Integer.toOctalString(hex);

        System.out.println(octNum);
        scanner.close();
    }
}
