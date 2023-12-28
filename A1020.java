import java.util.Scanner;

public class A1020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();

        String[] real = num.split("-");
        System.out.printf( "%d%d\n", Integer.parseInt(real[0]), Integer.parseInt(real[1]));
        //OR
        //System.out.println(num.replace("-",""))

        //勉強が必要なメソッド
        //Integer.parseInt , StringTokenizer
    }
}
