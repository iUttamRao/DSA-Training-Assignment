// Span = Max - Min
public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = {10,100,1,3,2,70};
        int max=arr[0];
        int min=arr[0];


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        // System.out.println(max);
        // System.out.println(min);
        int span = max-min;
        System.out.println("Span of array is "+span);

    }
}
