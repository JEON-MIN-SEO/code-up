import java.util.Scanner;

public class A1019 {
    //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Calender = s.nextLine();
        
        String[] num = Calender.split("\\."); // "."　代わりに　”\\."　で書けないといけない
        System.out.printf("%4d.%02d.%02d\n", Integer.parseInt(num[0]),Integer.parseInt(num[1]),Integer.parseInt(num[2]));
    }
}

//split                     https://jamesdreaming.tistory.com/84
//Integer.parseInt          https://jamesdreaming.tistory.com/125    
//https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String)


