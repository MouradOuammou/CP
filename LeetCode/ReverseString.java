public class ReverseString {
    public static void main(String[] args) {
        char[] tab = {'h', 'e', 'l', 'l','o'};

        reverseString(tab);
    }

public static void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;

    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }
}

    
}
