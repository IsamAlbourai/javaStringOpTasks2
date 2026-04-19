public class MixString {
    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";
        String result = "";

        int max;

        if (a.length() > b.length()) {
            max = a.length();
        }
        else {
            max = b.length();
        }

        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result = result + a.charAt(i);
            }
            if (i < b.length()) {
                result = result + b.charAt(i);
            }
        }

        System.out.println(result);
    }
}