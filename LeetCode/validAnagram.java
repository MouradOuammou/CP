class Anagram {

    public static void main(String[] args) {
        String t = "acac", s = "ccca";
        System.out.println(isValidANagram(s, t));
    }
    public static boolean  isValidANagram(String s , String t ){
        if(s.length() != t.length())
                return false ; 

        int [] res = new int [26];
        for (int i = 0 ; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            res[c1 - 'a']++;
            res[c2 - 'a']--;
        }
        for (int count : res) {
            if (count != 0) return false;
        }
        return true;
    }
}