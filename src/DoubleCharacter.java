public class DoubleCharacter {
    public static void main(String[] args) {

        String input = "The";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result = result + ch + ch;
        }

        System.out.println(result);
    }
}