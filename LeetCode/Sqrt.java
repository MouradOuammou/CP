class sqrt {
    public static void main(String[] args) {
        int x =  1 ; 
        System.out.println(mySqrt(x));
    }
     public static  int mySqrt(int x) {
        if (x < 2) {
        return x;
    }
    int left = 1;
    int right = x / 2;
    int result = 0;
    while (left <= right) {
        int     mid = left + (right - left) / 2;
        if ((long) mid * mid == x) {
            return mid; 
        } else if ((long) mid * mid < x) {
            result = mid;      
            left = mid + 1;   
        } else {
            right = mid - 1;   
        }
    }

    return result;
    }
}   