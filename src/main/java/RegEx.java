import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public void quantifiers() {
        // +
        String text = "Some text to text Chance, Cahance, channce, Channnce, Chace";
        Pattern pattern = Pattern.compile("Chan+ce");
        Matcher matcher = pattern.matcher("Some text to text Chance, Cahance, channce, Channnce");

        // syntax for while loop: while (condition) { code to execute if condition is true }
 //       while (matcher.find()) {
 //           System.out.println(matcher.group(0));
 //       {

            // * -> checks if the letter occurs 0 or more times
        Pattern pattern1 = Pattern.compile("Chan*ce");
        Matcher matcher1 = pattern1.matcher("Some text to text Chance, Cahance, channce, Channnce, Chace");

 //       while (matcher1.find()) {
 //           System.out.println(matcher1.group(0));
 //       }

        // ? -> zero or one occurrence
        Pattern pattern2 = Pattern.compile("Chan?ce");
        Matcher matcher2 = pattern2.matcher(text);

 //       while (matcher2.find()) {
 //           System.out.println(matcher2.group(0));
 //       }

        // {m, n} minimum of m occurrence and maximum of n occurrence
        Pattern pattern3 = Pattern.compile("Chan{1,4}ce");
        Matcher matcher3 = pattern3.matcher(text);

//        while (matcher3.find()) {
//            System.out.println(matcher3.group(0));
//        }

        // {m,} minimum of m occurrence
        Pattern pattern4 = Pattern.compile("Chan{2,}ce");
        Matcher matcher4 = pattern4.matcher(text);

//        while (matcher4.find()) {
//            System.out.println(matcher4.group(0));
//        }

        // {0, n} maximum of n occurrence
        Pattern pattern5 = Pattern.compile("Chan{0,4}ce");
        Matcher matcher5 = pattern5.matcher(text);

//        while (matcher5.find()) {
//            System.out.println(matcher5.group(0));
//        }

        // {n} finds exactly n occurrence
        Pattern pattern6 = Pattern.compile("Chan{3}ce");
        Matcher matcher6 = pattern6.matcher(text);

        while (matcher6.find()) {
            System.out.println(matcher6.group(0));
       }

    }

    public void scopesAndGroups() {
        // [abcde] -> one occurrence of either of the letters: "I am a text that has i"
        // [128]+

        String text = "Lorem ipsum dolor sit amet, consectetur test@eamil.com adipiscing elit. Duis porta molestie odio non vestibulum. Nunc ut semper erat. Nulla quis tristique purus. In condimentum venenatis hendrerit. Vivamus eget libero eu nisi gravida convallis. Donec consectetur ante vitae magna convallis aliquam. Praesent in gravida urna. Maecenas faucibus blandit ipsum vulputate consequat. Pellentesque aliquet quis dolor eu consectetur.\n" +
                "\n" +
                "Donec ut semper lacus. Etiam non dolor ut orci fringilla imperdiet placerat et leo. Suspendisse id iaculis dui. Nam convallis velit turpis. Morbi ut commodo nisl, vel fringilla augue. Nullam sit amet odio lectus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices 30-11-1978 posuere cubilia curae;\n" +
                "\n" +
                "Sed risus purus, accumsan quis blandit quis, dignissim non libero. Cras nunc elit, bibendum et nulla sed, fringilla suscipit 888-322-1344 dui. Vestibulum nibh erat, auctor et nisl at, vulputate varius lorem. Donec porttitor nisl quis vulputate placerat. Sed congue vel leo sit amet finibus. In malesuada arcu felis. Phasellus lobortis lorem non mauris iaculis, quis mollis purus rutrum. Sed congue sagittis porttitor. Duis rhoncus ipsum vitae ex aliquet, a tristique purus lacinia. Ut porttitor velit ut diam pulvinar, sit amet eleifend justo elementum. Nam nisl elit, imperdiet quis ultrices ut, laoreet sit amet arcu. Mauris a lacus ut nulla bibendum imperdiet. In hac habitasse platea dictumst. Maecenas a lacus eu ipsum hendrerit egestas ac a nulla.\n" +
                "\n" +
                "Integer quis auctor tellus. Donec eleifend quam ante, nec interdum dolor@yahoo.com congue ut. Nam at dolor id justo hendrerit tincidunt. Sed condimentum velit sed justo fringilla, ut bibendum urna tincidunt 232-423-1344. Maecenas nec efficitur leo. Nam blandit fermentum dui, id tristique justo. Maecenas accumsan imperdiet pharetra. Aenean sagittis risus erat, lobortis placerat orci porta vel. Nunc euismod ultricies nunc, vel convallis ex tempor ut. Aliquam aliquet nec enim non rutrum. Quisque ullamcorper mi id elit vehicula pretium. Nulla in lacus libero. In elementum eros nec risus convallis, in consectetur tortor varius. Donec fringilla condimentum metus ac molestie.\n" +
                "\n" +
                "Aliquam id semper orci. Nulla facilisi. Quisque aliquet, risus vel bibendum varius, risus massa tristique augue@bing.com, sed vehicula erat diam eu quam. Praesent a rutrum massa. Donec convallis cursus orci ut maximus. Duis cursus sodales arcu dignissim porta. Cras ornare nisl magna, sed fermentum dui porta tristique 20-12-1987. Ut fermentum dapibus dolor et auctor. Nullam elementum lacus erat, vitae pretium elit sagittis at. In semper urna ac imperdiet pretium. Praesent ultricies consequat ante. Aliquam malesuada, metus ut semper posuere, quam libero vestibulum mauris, in luctus velit sapien at enim.\n";

        Pattern pattern = Pattern.compile("[128]+");
        Matcher matcher = pattern.matcher(text);

 //       while (matcher.find()) {
 //           System.out.println(matcher.group(0));
 //       }

        // [0-9] -> checks for occurrence between 0 - 9
        // [a-z] -> check for occurrence between a - z

        Pattern pattern1 = Pattern.compile("[0-9]+");
        Matcher matcher1 = pattern1.matcher(text);

 //       while (matcher1.find()) {
 //           System.out.println(matcher1.group(0));
 //       }

        // Date of birth pattern

        Pattern pattern2 = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
        Matcher matcher2 = pattern2.matcher(text);

 //       while (matcher2.find()) {
 //           System.out.println(matcher2.group(0));
 //       }

        // Create a regular for finding a mobile numbers e.g 114-414-5822

        Pattern pattern3 = Pattern.compile("[1-9]{3}-[1-9]{3}-[1-9]{4}");
        Matcher matcher3 = pattern3.matcher(text);

//        while (matcher3.find()) {
//            System.out.println(matcher3.group());
//        }

        // Create a regular expression for finding email addresses

        Pattern pattern4 = Pattern.compile("[a-z]{1,9}@[a-z]{1,9}.[a-z]{1,9}");
        Matcher matcher4 = pattern4.matcher(text);

        while (matcher4.find()) {
            System.out.println(matcher4.group());
        }

    }


}
