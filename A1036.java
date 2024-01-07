import java.util.Scanner;

public class A1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char c = string.charAt(0);

        int uni = (int)c;
        scanner.close();

        System.out.println(uni);
    }
}
