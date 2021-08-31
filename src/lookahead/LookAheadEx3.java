package lookahead;

import java.util.regex.Pattern;

public class LookAheadEx3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$");

        String test = "www.google.com";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "-ww.google.com";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "ww-.google.com";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "ww.goo-gle.com";
        System.out.println("Result: " + pattern.matcher(test).matches());
    }
}
