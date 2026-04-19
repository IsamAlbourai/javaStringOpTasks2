public class StarOut {
    public static void main(String[] args) {

        String text = "ab*cd";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '*') {
                continue;
            }

            if (i > 0 && text.charAt(i - 1) == '*') {
                continue;
            }

            if (i < text.length() - 1 && text.charAt(i + 1) == '*') {
                continue;
            }

            result = result + text.charAt(i);
        }

        System.out.println(result);
    }
}