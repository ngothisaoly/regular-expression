import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        String reExpress  = ".*Congnghetuts.com.*";
        String testString = "Hello! Congnghetuts.com. Thanks you";

        Pattern pattern = Pattern.compile(reExpress);
        Matcher matcher = pattern.matcher(testString);

        boolean result1 = matcher.matches();

        boolean result2 = pattern.matches(reExpress, testString);

        System.out.println("Result1: " + result1 + "\nResult2: "+result2);
    }
}
