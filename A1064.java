import java.util.Scanner;

public class A1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[] arr = {a,b,c};
        int answer=0;

        for(int i = 0; i<arr.length;i++){
            if(answer>arr[i]){
                answer = arr[i];
            }
        }
        //int answer = (a<b)?((a<c)?a:c):((b<c)?b:c)
        //三項演算子 == 条件?真の場合:偽りの場合

        System.out.println(answer);
        scanner.close();
    }
}