public class LengthofLastWord {
    public static void main(String[] args) {

    lengthOfLastWord("Hello World Ouam mou ");
    }

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ')
            --i;
        final int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
            --i;

        return lastIndex - i;
    }

}
