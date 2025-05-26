class drawing {
    public static void main(String[] args) {
        
    }
     public static int pageCount(int n, int p) {
            int pagetourne = p/2 ; 
            int totalSheets = n / 2  ;
                    int fromBack = totalSheets - pagetourne;

            return Math.min(pagetourne, fromBack);

    }

}