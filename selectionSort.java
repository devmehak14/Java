 static class selectionSort {

    // when function are in class --> called method
    // every thing is passed as value in java
    void selSort(int [] arr){
        
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            int smallest= arr[i];
            int idx =i;

            for (int j = i+1; j < n; ++j) {
                if(smallest>arr[j]){
                int smallest= arr[j];
                int idx =j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }

    public static void main(String[] args){

        int [] arr = {10,2,5,1,16};
        selSort(arr);

        // Ways to iterate array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for (int i : arr) {             // foreach loop --> cannot work in reverse direction 
            System.out.print(i + " ");
        }


    }

    
}
