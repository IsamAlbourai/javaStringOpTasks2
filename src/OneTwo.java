public class OneTwo {
    public static void main(String[] args) {

        String text = "tcagdo";
        String result = "";

        for (int i = 0; i < text.length() - 2; i += 3) {
            result = result + text.charAt(i + 1) + text.charAt(i + 2) + text.charAt(i);
        }

        System.out.println(result);
    }
}