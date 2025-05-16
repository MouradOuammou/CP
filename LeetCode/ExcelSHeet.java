class Excel {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
                System.out.println(titleToNumber("AD"));

    }
    public static String convertToTitle(int columnNumber) {
    StringBuilder res = new StringBuilder();

    while (columnNumber > 0) {
        int mod = (columnNumber - 1) % 26;
        char lettre = (char) ('A' + mod);

        res.insert(0, lettre);
        columnNumber = (columnNumber - 1) / 26;
    }

    return res.toString();
}
public static  int titleToNumber(String columnTitle) {
            int res = 0 ; 
            for(int  i =0 ; i<columnTitle.length(); i++) {
                char c = columnTitle.charAt(i);
                int lettre  = c - 'A' +1 ; 
                res = res*26 + lettre ;  
            }  
            return res ; 
    }

}