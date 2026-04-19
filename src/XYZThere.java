public class XYZThere {
    public static void main(String[] args) {

        String text = "abcxyz";
        boolean result = false;

        for (int i = 0; i < text.length() - 2; i++) {
            if (text.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || text.charAt(i - 1) != '.') {
                    result = true;
                }
            }
        }

        System.out.println(result);

    }
}