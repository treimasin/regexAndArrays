import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("a+bcd");
//        Matcher matcher = pattern.matcher("this is the sample text of aaabcd, abcd, aabbcd");
//
//        // .find method returns true or false if pattern is found
//        if (matcher.find()) {
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.find());
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.find());
//
//        } else {
//            System.out.println("Pattern not found");
//        }

        RegEx regEx = new RegEx();
        regEx.quantifiers();
        regEx.scopesAndGroups();

    }

}