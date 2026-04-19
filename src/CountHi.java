public class CountHi {
    public static void main(String[] args) {

        String text = "hihihi";
        int count = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            String sub = text.substring(i, i + 2);

            if (sub.equals("hi")) {
                count++;
            }
        }

        System.out.println(count);
    }
}