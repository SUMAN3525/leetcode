// Dout
public class water_bottles {
    public static int water(int numbottles, int numExchange){
        int ans=numbottles;
        while(numbottles>=numExchange){
            int newbottles=numbottles / numExchange;
            int rewbottles=numbottles % numExchange;
            ans=ans+newbottles;
            numbottles=newbottles+rewbottles;
        }
        return ans;
    }
    public static void main(String[] args) {
        int numbottles=9;
        int numExchange=3;
        System.out.println(water(numbottles,numExchange));
    }
}