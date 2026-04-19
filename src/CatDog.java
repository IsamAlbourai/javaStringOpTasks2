public class CatDog {
    public static void main(String[] args) {

        String text = "catdog";
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < text.length() - 2; i++) {
            String sub = text.substring(i, i + 3);

            if (sub.equals("cat")) {
                catCount++;
            }
            if (sub.equals("dog")) {
                dogCount++;
            }
        }

        System.out.println(catCount == dogCount);
    }
}
