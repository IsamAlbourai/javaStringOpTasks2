public class PlusOut {
    public static void main(String[] args) {

        String text = "12xy34";
        String word = "xy";

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (i <= text.length() - word.length() && text.substring(i, i + word.length()).equals(word)) {

                result = result + word;
                i = i + word.length() - 1;

            } else {
                result = result + "+";
            }
        }

        System.out.println(result);
    }
}
