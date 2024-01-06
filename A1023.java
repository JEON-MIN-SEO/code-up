import java.util.Scanner;

public class A1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();

        int num1 = (int)input;
        //double num2 = input - (int)input;
        
        String num2 = String.valueOf(input).substring(String.valueOf(input).indexOf(".")+1);
        // String.valueOf(intput)の意味はdoubleのinputをstringに変える
        //　substring(...)はメソッドの最初のインデくそインデックスから最後のインデックスまで返還
        // indexOf(".")+1特定の文字を探すときに使用 +1は　.次から返還するため

        System.out.println(num1 + "\n" + num2);
        

        //String st = "abcdefg";
        //System.out.println(st.substring(2));
        //result=cdefg
    }
    
}
