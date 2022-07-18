public class TwoArrayDifference {
    public static void main(String[] args) {
        int first[] ={5,1,3,4};
        int second[] ={4,2,4,5};
        int third[]= new int[first.length];

        int i = first.length-1;
        int j = second.length-1;
        int k = third.length-1;
        int carry =0;

        while(i>=0 || j>=0){
            if(first[i]<second[j]){
                third[k]= first[i] +10 + carry - second[j];
                i--;
                j--;
                k--;
                carry=-1;
            }
            else{
                third[k] = first[i] + carry - second[j];
                i--;
                j--;
                k--;
                carry =0;
            }
        }
        for(int e : third){
            System.out.print(e+ " ");
        }
    }
}
