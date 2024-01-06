import java.util.Scanner;

public class A1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        //入力範囲 (+- 1.7*10-308 ~ +- 1.7*10308 )
        //Float 小数点5桁, Double 小数点14桁
        System.out.printf("%.11f", num);
        
        //String result = String.format("%.11f", num);
        //System.out.println(result);
    }
}
