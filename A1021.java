import java.util.Arrays;
import java.util.Scanner;

public class A1021{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        String result = check(word, 10);

        char[] arr = result.toCharArray();
        
        System.out.println(Arrays.toString(arr));
    }

    private static String check(String input, int length){
        if(input.length() <= length){
            return input;
        }
        else{
            return "erroe";
        }
        //first my method
    }
}