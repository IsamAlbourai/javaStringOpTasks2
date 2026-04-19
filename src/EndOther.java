public class EndOther {
    public static void main(String[] args) {

        String a = "Hiabc";
        String b = "abc";

        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        boolean result;

        if (aLower.length() >= bLower.length()) {
            result = aLower.substring(aLower.length() - bLower.length()).equals(bLower);
        } else {
            result = bLower.substring(bLower.length() - aLower.length()).equals(aLower);
        }

        System.out.println(result);
    }
}