public class missing_num {
    public static void missing(int arr[]){
        int temp=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            else{
                temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,10};
        missing(arr);
    }
}
