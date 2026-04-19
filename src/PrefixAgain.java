public class PrefixAgain {
    public static void main(String[] args) {

        String text = "abXYabc";
        int n = 2;

        String prefix = text.substring(0, n);
        boolean result = false;

        for (int i = n; i <= text.length() - n; i++) {
            if (text.substring(i, i + n).equals(prefix)) {
                result = true;
            }
        }

        System.out.println(result);
    }
}