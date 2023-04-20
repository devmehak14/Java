import java.util.Arrays;

// Approach --> last sbse bde ko usse phle wale se swap and then sort last bade wale k baad ka array

class NextPermutation {

    static void NextPermutation(int[] arr)
    {
            int n=arr.length;

            int pos1=0,pos2=0;

            boolean lexographicallyLargest=true;
            for(int i=n-2;i>=0;i--)                  // from second last to 1st
            {
                if(arr[i]<arr[i+1])
                {   
                    lexographicallyLargest=false;               // monotonically increasing , not any dive

                    pos1=i;                                  // index of element save that is changing the array tree
                    break;
                }
            }

            for(int i=n-1;i>=0;i--)            

            {
                if(arr[i]>arr[pos1])
                {   
                    pos2=i;
                    break;
                }
            }


            if(lexographicallyLargest)
            {
                Arrays.sort(arr,0,n);
                return;
            }

            int tmp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=tmp;
            
            Arrays.sort(arr,pos1+1,n);              // starting index--> inclusive , ending index --> exclusive
    }

    public static void main(String[] args) {
        
        int arr[]={3,2,1};

        NextPermutation(arr);

        for(int ele:arr)
        System.out.print(ele);

    
    }
    
}