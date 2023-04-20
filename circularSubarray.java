// class circularSubarray {

//     static void printSubarrays(int [] arr){
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int size = 1; size <= n; size++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print(arr[(i+j)%n] + " ");  
//             }
//             System.out.println("");   
//         }   
// }
//     }
//     public static void main(String[] args) {       
//         int [] arr={1,2,3,4};
//         printSubarrays(arr);
//     }   
// }

// MAXIMUM SUM OF A SUB ARRAY
// class circularSubarray {
//     static void maxSubarraySum(int [] arr){
//         int n = arr.length;
//         int maxsum=Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             for (int size = 1; size <= n; size++) {
//                 int curr_Sum =0;
//             for (int j = 0; j < size; j++) {
//                 curr_Sum+= arr[(i+j)%n];
//                 maxsum= maxsum> curr_Sum ? maxsum : curr_Sum;              
//             }  
//         }       
//     }
//     System.out.println(maxsum);
//     }
//     public static void main(String[] args) {
        
//         int [] arr={1,2,3,4};
//         maxSubarraySum(arr);
//     }    
// }

// 2nd method --> more optimized
// Maximum sum can reside in circular or linear part
// If it reside in linear part --> apply kadane's algorithm
// If it reside in circular part --> max_sum = total sum - minimum sum


public class circularSubarray {
    static int kadane(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        boolean allNegative=true;

        int maxNo=Integer.MIN_VALUE;

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            allNegative=false;

            if(currSum+arr[i]>0)
            currSum+=arr[i];

            else
            currSum=0;

            maxSum=Math.max(maxSum, currSum);

            maxNo=Math.max(maxNo,arr[i]);


        }

        if(allNegative)
        return maxNo;

        return maxSum;
    }

    
   static int minSubArraySum(int[] arr)
    {
        int n=arr.length;

        int currSum=0;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
                if(currSum+arr[i]<0)
                currSum+=arr[i];

                else
                currSum=0;

                if(currSum<minSum)
                minSum=currSum;
        }
        return minSum;
    }

    static int total(int arr[])
    {
        int sum=0;

        for(int ele:arr)
        {
            sum+=ele;
        }
        return sum;
    }

   static int maxSubarraySumCircular(int[] arr) 
    {
        // Apply kadane on this array
            int normalSum=kadane(arr);

        // Check cirrcular Sum
        
        int circularSum=total(arr)-minSubArraySum(arr);

        if(circularSum==0)
        return normalSum;

        if(circularSum>normalSum)
        return circularSum;

        return normalSum;


    }

    public static void main(String[] args) {
        

        int arr[]={1,2,-10,-40,5};

        System.out.println("Max sum is: "+maxSubarraySumCircular(arr));
    }
    
}




