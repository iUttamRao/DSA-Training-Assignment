class ThirdLargestElementInArray{
    public static void main(String[] args) {
        int arr[] = {34,67,98,43,15,90,50};
        int firstLargest =-1;
        int secondLargest=-1;
        int thirdLargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            if(arr[i]!=firstLargest){
                if(arr[i]>secondLargest){
                    thirdLargest=secondLargest;
                    secondLargest=arr[i];
                }
            }
            if(arr[i]!=firstLargest && arr[i]!=secondLargest){
                if(arr[i]>thirdLargest){
                    thirdLargest=arr[i];
                }
            }
        }
        System.out.println("First Largest: "+firstLargest);
        System.out.println("Second Largest: "+secondLargest);
        System.out.println("Third Largest: "+thirdLargest);
        
    }
}