// leetcode 53 no problem
public class Max_sub_arr{
    public static int max(int num[]){
        if(num.length==0){
        return 0;
        }
        int maxs=num[0];
        int current_max=num[0];
        for(int i=0; i<num.length; i++){
            int n=num[i];
            current_max=Math.max(current_max+n, n);
            // System.out.println(current_max);
            maxs=Math.max(maxs,current_max );
        }
        return maxs;
    }
    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max(num));
    }
}