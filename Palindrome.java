public class Palindrome {
    public static void main(String []args){
        int x=121;
        Solution s=new Solution();
        System.out.println(s.ispalindrome(x));
    }
}
class Solution{
    public  boolean ispalindrome(int x){
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
