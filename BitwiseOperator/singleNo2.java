package BitwiseOperator;

class singleNo2 {
    static int getIthBit(int no,int i){
        // no = no>> i;
        

    }
    static int getIthBit(int no,int i){
        // no = no>> i;
        int mask = 1<< i;
        return no | mask;

    }
    
    static int uniqueNo(int [] arr){
        int ans=0;
        for(int i=0;i<32;i++){
            int cnt =0;
            for (int no : arr) {
                no = no >> i;

                if((no & 1) == 1)
                cnt ++;     
            }

            if(cnt % 3!=0)
            // ans = ans|(1<<i);
            setIthBit(ans,i);
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr={1,1,1,2,3,2,2};

        System.out.println("Unique no = " + uniqueNo(arr));

        
    }
    
}
