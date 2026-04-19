public class WordEnds {
    public static void main(String[] args) {

        String text = "abcXY123XYijk";
        String word = "XY";
        String result = "";

        for (int i = 0; i <= text.length() - word.length(); i++) {

            if (text.substring(i, i + word.length()).equals(word)) {

                if (i > 0) {
                    result = result + text.charAt(i - 1);
                }

                if (i + word.length() < text.length()) {
                    result = result + text.charAt(i + word.length());
                }
            }
        }

        System.out.println(result);
    }
}