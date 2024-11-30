import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int first=0;
        int second=1;
        for(int i=0; i<n; i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return first;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("output: ");
        System.out.print(fibonacci(n));
    }
}
