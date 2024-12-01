public class power_of_two {
    public static void main(String []args){
        solution s=new solution();
        int n=16;
        System.out.println(s.ispower(n));
    }
}
    class solution{
    public static boolean ispower(int n){
        if(n<1){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/10;
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }
    }    
    }