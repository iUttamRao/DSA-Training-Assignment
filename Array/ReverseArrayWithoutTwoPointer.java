public class ReverseArrayWithoutTwoPointer {
    public static void main(String[] args) {
        int arr[] = {10,15,25,30,40,50,65,75,100};
        int revArr[]= new int[arr.length];
        int j=0;

        System.out.print("Original Array: ");
        for(int e : arr){
            System.out.print(e+ " ");
        }
        for(int i=arr.length-1;i>=0;i--){
            revArr[j]=arr[i];
            j++;
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for(int e : revArr){
            System.out.print(e+ " ");
        }
    }
}
