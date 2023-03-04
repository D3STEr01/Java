public class InverteString {
    public static void main(String[] args) {
        String input = "Job Rotation - Sao Paulo";
        String reversed = inverteString(input);
        System.out.println(reversed);
    }

    public static String inverteString(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}


