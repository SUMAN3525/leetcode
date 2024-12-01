public class tribonacci {
    public static int tribo(int n){
        if (n==0) {
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        } 
        int first=0;
        int second=1;
        int third=1;
        for(int i=0; i<n; i++){
            int fourth=first+second+third;
            first=second;
            second=third;
            third=fourth;
        }
        return first;
    }
    public static void main(String []args){
        System.out.println(tribo(25));
    }
}
