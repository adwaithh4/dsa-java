package string;

public class FirstUpper {
   

    public static String capitalizeWords(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i + 1,
                        Character.toUpperCase(sb.charAt(i + 1)));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world from java";

        System.out.println(capitalizeWords(str));
    }
}

