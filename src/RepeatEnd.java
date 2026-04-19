public class RepeatEnd {
    public static void main(String[] args) {

        String text = "Hello";
        int n = 3;

        String end = text.substring(text.length() - n);
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + end;
        }

        System.out.println(result);
    }
}
