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

        //12/29 (https://colossus-java-practice.tistory.com/32)
        //Integer.parseInt => String => Int変換

        //StringTokenizer ブログ
        //https://reakwon.tistory.com/90
    }
}
