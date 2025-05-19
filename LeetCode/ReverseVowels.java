class  ReverseVowels {
    public static void main(String[] args) {
        
    }

     public String reverseVowels(String s) {
      char[] res = s.toCharArray();
      int left = 0;
      int right = res.length - 1;

        while (left < right) {
        // Avancer left jusqu'à une voyelle
        while (left < right && !isVowel(res[left])) {
            left++;
        }
        // Reculer right jusqu'à une voyelle
        while (left < right && !isVowel(res[right])) {
            right--;
        }
        // Échanger les voyelles trouvées
        char temp = res[left];
        res[left] = res[right];
        res[right] = temp;

        left++;
        right--;
    }
    return new String(res);
}

    public static  boolean isVowel(char c) {
    c = Character.toLowerCase(c);  
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

}