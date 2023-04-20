class bubbleSort {
    static void bubsort(int arr[]){
        int n =arr.length;
        
        for (int i = 0; i <n; ++i)
	{	
		int isSorted=1;
		for (int j = 0; j<n-1-i; ++j)
		{

			
			if(arr[j]>arr[j+1])
			{
				int tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				isSorted=0;
			}
		}

		if(isSorted ==1)
			break;

    }
}
    public static void main(String[] args) {
        
        int arr[]={10,2,4,6,5,1};
        bubsort(arr);

        for (int i : arr) {            
            System.out.print(i + " ");
        }

    }
}
    

