import java.util.*;
public class Array_form {
    public static int asum(int num[], int k){
        int p=num.length-1;
        ArrayList<Integer> list= new ArrayList<>();
        int carry=0;
        while(p>=0  || k>0){
            while (k>0) {
                k=k%10;
                num[num.length-1]=num[num.length-p]+k;
                k=k/10;
            }
            p--;
        }
        return num;
    }
}
