public class CountCode {
    public static void main(String[] args) {

        String text = "aaacodebbb";
        int count = 0;

        for (int i = 0; i < text.length() - 3; i++) {
            String sub = text.substring(i, i + 4);

            if (sub.charAt(0) == 'c' &&  sub.charAt(1) == 'o' && sub.charAt(3) == 'e') {
                count++;
            }
        }

        System.out.println(count);
    }
}