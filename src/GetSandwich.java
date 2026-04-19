public class GetSandwich {
    public static void main(String[] args) {

        String text = "xxbreadjambreadyy";

        int first = text.indexOf("bread");
        int last = text.lastIndexOf("bread");

        String result = "";

        if (first != -1 && last != -1 && first != last) {
            result = text.substring(first + 5, last);
        }

        System.out.println(result);
    }
}