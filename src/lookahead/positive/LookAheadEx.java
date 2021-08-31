package lookahead.positive;

import java.util.regex.Pattern;

public class LookAheadEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^.*(?=congnghetuts).*$");

        String test = "Xin chao moi nguoi";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "Xin chao congnghetuts";
        System.out.println("Result: " + pattern.matcher(test).matches());

        test = "Xin chao congnghetuts 1234";
        System.out.println("Result: " + pattern.matcher(test).matches());
    }
}
