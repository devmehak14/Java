 class binarysearch {

    static int bSearch(int arr[],int key){
        int n =arr.length;
        int s=0,e=n-1;
        int mid;

        while(s<e){
            
                mid=(s+e)/2;
            
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid]> key){
                e=mid-1;
            }
            else{
                s =mid+1;
            }
        
       
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr []={3,5,6,9};
        int key=6;
        int idx =bsearch(arr,key);
        System.out.println("Element found at "+ idx);

    }
    
}
