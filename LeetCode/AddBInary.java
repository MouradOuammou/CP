public class AddBInary {
    public static void main(String[] args) {

    }
    public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            int i = a.length() - 1;
            int j = b.length() - 1;
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i) - '0';

                }
                if (j >= 0) {
                    sum += b.charAt(j) - '0';
                }
                carry = sum / 10;
                sum %= 10;
                sb.append(sum);

        }
            if (carry != 0) {
                sb.append(carry);

            }
            return sb.reverse().toString();
    }

}
