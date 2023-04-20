class initial{
    public static void main(String[] args) {
        //initialisation

        int arr[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        System.out.println(arr.length);             // number of rows

        System.out.println(arr[0].length);          // number of columns

        // new --> keyword that dynamically allocate memory at run time and give value 0
        int [][] demo = new int [4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(demo[i][j]);
                
            }
            System.out.print("\n");
        }  
        
        //static allocation
        int [][] jaggedarray = {{1,2,3},{4,5},{6,7,8,9}}; 

        // dynamically allocate
        int [][] jagged = new int [4][];
    }
}