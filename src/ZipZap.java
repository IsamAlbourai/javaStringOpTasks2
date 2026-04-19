public class ZipZap {
    public static void main(String[] args) {

        String text = "zipXzap";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (i < text.length() - 2 && text.charAt(i) == 'z' && text.charAt(i + 2) == 'p') {

                result = result + "zp";
                i = i + 2;

            } else {
                result = result + text.charAt(i);
            }
        }

        System.out.println(result);
    }
}
