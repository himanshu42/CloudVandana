import java.util.concurrent.ThreadLocalRandom;

class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7};
        
        for(int i=0;i<arr.length;i++){
            int shuffle=ThreadLocalRandom.current().nextInt((6-0)+1);
            //getting random numbers
            int temp=arr[i];
            arr[i]=arr[shuffle];
            arr[shuffle]=temp;
            //shuffling 
        }
        
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
    }
}
