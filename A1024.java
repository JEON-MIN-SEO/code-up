import java.util.Scanner;

public class A1024 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    char[] arr = str.toCharArray(); 
    
    for(int i = 0; i <arr.length; i++){
        System.out.println("\'"+arr[i]+"\'");
    }
}
    
}