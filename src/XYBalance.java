public class XYBalance {
    public static void main(String[] args) {

        String text = "aaxbby";
        boolean foundY = false;
        boolean result = true;

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == 'y') {
                foundY = true;
            }
            if (text.charAt(i) == 'x' && !foundY) {
                result = false;
            }
        }

        System.out.println(result);
    }
}
