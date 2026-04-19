public class SameStarChar {
    public static void main(String[] args) {

        String text = "xy*yzz";
        boolean result = true;

        for (int i = 1; i < text.length() - 1; i++) {
            if (text.charAt(i) == '*') {
                if (text.charAt(i - 1) != text.charAt(i + 1)) {
                    result = false;
                }
            }
        }

        System.out.println(result);
    }
}