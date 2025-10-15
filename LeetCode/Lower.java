public class Lower {
    public static void main(String[] args) {
        int n = 10 ; 
        System.out.println(guessNumber(n));

    }
     public static  int guessNumber(int n) {
        return BinarySearsh(n);
    }

    public static  int BinarySearsh(int n )  {
        int left = 0 ; 
        int right  = n ; 
        while(left<=right){
            int mid  = left  +(right-left)/2 ; 
            if(mid== n) return mid ; 
            else if(mid<n) {
            left  = mid +  1 ;
            }else right = mid - 1 ; 
        }
        return -1 ; 
    }
    
}
