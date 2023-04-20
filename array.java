import java.util.Scanner;

class array {
    public static void main(String[] args){

        // initialisation
        int arr[]={1,2,3,4,5};          // no need to give size, java itself give size acc. to no. of elements

        int [] arr2={1,2,3,4,5};

        // with size
        int arr3[]=new int[10];     // reference of array with size 10 is from arr3

        int [] arr4=new int [6];

        // scanner(system.in)  --> constructor
        Scanner sc=new Scanner(System.in);      // making object of scanner,scanner taking standard input(from where the system is taking ipnut)

        
        int n=sc.nextInt();
        int [] arr5=new int [n];


    }
    
}
