public class RepeatSeparator {
    public static void main(String[] args) {

        String word = "Word";
        String sep = "X";
        int n = 3;

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + word;

            if (i != n - 1) {
                result = result + sep;
            }
        }

        System.out.println(result);
    }
}
