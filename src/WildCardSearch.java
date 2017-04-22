/**
 * Created by shekhar on 10/12/16.
 */
public class WildCardSearch {

    public static void main(String[] args) {
        if (isMatch("aab", "*ab")) {
            System.out.println("Match");
        } else {
            System.out.println("Does not watch");
        }
    }

    public static boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        char[] ch = s.toCharArray();
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '?') {
                i++;
                j = j + 2;
            } else if (j < p.length() && p.charAt(j) == '*') {
                i = findNextIndex(ch, i, s.charAt(i));
                j = j + 2;
            } else {
                return false;
            }
        }
        if (i == ch.length) {
            return true;
        }

        return false;
    }

    public static int findNextIndex(char[] ch, int i, char a) {
        i++;
        if (i == ch.length) {
            return i;
        }
        while (ch[i] == a) {
            i++;
        }
        return i;
    }
}
