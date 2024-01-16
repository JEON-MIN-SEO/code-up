import java.util.Scanner;

public class A1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a==0 || b==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        scanner.close();
    }
}
//1/16-1