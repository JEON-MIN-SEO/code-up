import java.util.Scanner;

public class A2026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] time = str.split(":");
        System.out.printf( "%d\n", Integer.parseInt(time[1]));
    }
}
