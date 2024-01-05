import java.util.Scanner;

public class A2027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] output = input.split("\\.");
        System.out.printf( "%02d"+"-"+"%02d"+"-"+"%d\n", Integer.parseInt(output[2]), Integer.parseInt(output[1]), Integer.parseInt(output[0]));
        //System.out.println(output[2]+"-"+output[1]+"-"+output[0]);
    }
}
