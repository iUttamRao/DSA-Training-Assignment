public class ZigZagArray{
    public static void main(String[] args) {
        int arr[]={4,3,7,8,2,6,1};
        //output = {3,7,4,8,2,6,1}
        for(int i=0;i<arr.length-2;i=i+2){
            if(arr[i]<arr[i+1]){
            }
            else{
                int temp2 = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp2;
            }
            if(arr[i+1]>arr[i+2]){
            }
            else{
                int temp = arr[i+1];
                arr[i+1] = arr[i+2];
                arr[i+2] = temp;
            }
        }
        for (int e : arr) {
            System.out.print(e+ " ");
        }
    }
}