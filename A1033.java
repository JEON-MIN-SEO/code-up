import java.util.Scanner;

public class A1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        int oct = Integer.valueOf(str, 8);
        System.out.println(oct);
    }
}
