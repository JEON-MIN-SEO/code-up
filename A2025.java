import java.util.Scanner;

public class A2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] num = str.toCharArray();

        for(int i = 0; i < num.length; i++){
            System.out.print("["+num[i]);
            for(int j = 0; j<num.length-i-1; j++){
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
