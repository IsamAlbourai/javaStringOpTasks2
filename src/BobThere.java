public class BobThere {
    public static void main(String[] args) {

        String text = "abcbob";
        boolean result = false;

        for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == 'b' && text.charAt(i + 2) == 'b') {
                result = true;
            }
        }

        System.out.println(result);
    }
}
