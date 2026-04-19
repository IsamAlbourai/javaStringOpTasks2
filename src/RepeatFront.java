public class RepeatFront {
    public static void main(String[] args) {

        String text = "Chocolate";
        int n = 4;

        String result = "";

        for (int i = n; i > 0; i--) {
            result = result + text.substring(0, i);
        }

        System.out.println(result);
    }
}
