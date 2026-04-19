public class xyzMiddle {
    public static void main(String[] args) {

        String text = "AxyzBB";
        int index = text.indexOf("xyz");

        boolean result = false;

        if (index != -1) {
            int left = index;
            int right = text.length() - (index + 3);

            if (left - right <= 1 && right - left <= 1) {
                result = true;
            }
        }

        System.out.println(result);
    }
}
