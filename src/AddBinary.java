/**
 * Created by shekhar on 29/11/16.
 */
public class AddBinary {

    public static void main(String[] args) {
        String str = "011";
        String str2 = "1011";

        int carry = 0;
        StringBuffer result = new StringBuffer();
        for (int i = str.length() - 1, j = str2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int v1 = i < 0 ? 0 : str.charAt(i) - '0';
            int v2 = j < 0 ? 0 : str2.charAt(j) - '0';

            char val = (char) ((v1 + v2 + carry) % 2);
            carry = (v1 + v2 + carry) / 2;

            result.insert(0, (char) (val + '0'));
        }

        if (carry == 1) {
            result.insert(0, '1');
        }
        System.out.print(result.toString());
    }
}
