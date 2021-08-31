package lookahead.negative;

import java.util.regex.Pattern;

public class LookAheadEx2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?!hello)[a-zA-Z0-9-,]*$");

        String test = "hello,abc";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "abc,hello";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "abc-hello-abc";
        System.out.println("Result: " + pattern.matcher(test).matches());
    }
}
