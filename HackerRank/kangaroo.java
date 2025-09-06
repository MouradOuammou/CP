public class kangaroo {
    public static void main(String[] args) {
        
    }

    public static String canKangaroosMeet(int x1, int v1, int x2, int v2) {
        if( x1 == x2 ) {
            if( v1> v2 ||v1 <v2) return "NO" ; 
            else if( v1 == v2 ) return "YES";
        }
        else if((x1 >x2 && v1 > v2) || (x1<x2 && v1< v2))    return  "NO";        
        return  "YES";
    }

}
