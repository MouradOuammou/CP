import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagran {
    public static void main(String[] args) {
        String [] strr = { "eat","tea","tan","ate","nat","bat"} ; 
        System.out.println(groupAnagrams(strr));
    }
     public static  List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null  || strs.length == 0 ) return new ArrayList<>();
        HashMap<String,List<String>> frequeMap = new  HashMap<>();
        for(String str : strs) {
            String frequencyString = getFrequency(str) ; 
            if(frequeMap.containsKey(frequencyString)) {
                frequeMap.get(frequencyString).add(str);
            }
            else {
                List<String>    strlist = new ArrayList<>(); 
                strlist.add(str ) ; 
                frequeMap.put(frequencyString, strlist);
            }
        }
        return new ArrayList<>(frequeMap.values()) ;  
    }
    public static String getFrequency(String mot ) {
         int [] freq  = new int [26] ; 
         for(char c : mot.toCharArray()) {
            freq[c- 'a']++  ;
         }  
         StringBuilder freqString = new StringBuilder("");
         char c  = 'a' ; 
        for(int i : freq) {
            freqString.append(c).append(i);
            c++;
        }
        return freqString.toString();
    }
}