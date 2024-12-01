import java.util.Scanner;
public class Two_sum {
    public static boolean sum(int n, int a[], int target){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]+a[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                
                }
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int a[]=new int [n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(sum(n, a, target));
    }
}
