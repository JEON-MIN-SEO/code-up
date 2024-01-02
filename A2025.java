import java.util.Scanner;

public class A2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] num = str.toCharArray();

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
            for(int j = num.length -1; j>i; j--){
                System.out.print("0");
            }
        }
    }
}
