public class FindTheIndex {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length() < needle.length())
            return -1;

        int m = haystack.length(), n = needle.length();
        for(int i = 0; i <= m - n; i++) {
            String sub = haystack.substring(i, i + n);
            if(sub.equals(needle))
                return i;
        }

        return -1;
    }

}
