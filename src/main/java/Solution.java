public class Solution {

    public int countDigits(String string) {
        int count = 0;
        char[] strToArray = string.toCharArray();
        for (Character strChar : strToArray) {
            if (Character.isDigit(strChar))
                count++;
        }
        return count;
    }

    public int countLetters(String string) {
        int count = 0;
        char[] strToArray = string.toCharArray();
        for (Character strChar : strToArray) {
            if (Character.isLetter(strChar))
                count++;
        }
        return count;
    }

    public int countSpaces(String string) {
        int count = 0;
        char[] strToArray = string.toCharArray();
        for (Character strChar : strToArray) {
            if (Character.isWhitespace(strChar))
                count++;
        }
        return count;
    }

    public String replacer(String string) {
        while (string.contains("  ")) {
            String replace = string.replace("  ", " ");
            string = replace;
        }
        return string;
    }
}
