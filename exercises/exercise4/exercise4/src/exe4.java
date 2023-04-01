import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class exe4 {

    public static void main(String[] args) {

        // case 1
        String name = "Dongyu Li";
        String Pattern1 = "^[A-Z][a-z]*\\s[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(Pattern1);
        Matcher matcher = pattern.matcher(name);
        System.out.println("Name:" + name);
        if (matcher.matches()) {
            System.out.println("Valid.");
        } else {
            System.out.println("A valid name should contain both uppercase letters and lowercase letters.");
        }

        // case 2
        String birthday = "05/23/1994";
        String Pattern2 = ("\\d{2}/\\d{2}/\\d{4}");
        pattern = Pattern.compile(Pattern2);
        matcher = pattern.matcher(birthday);
        System.out.println("Birthday:" + birthday);
        if (matcher.matches()) {
            System.out.println("Valid.");
        } else {
            System.out.println("A valid date should be in mm/dd/yyyy format.");
        }

        // case 3
        String phone = "838-876-6935";
        String Pattern3 = "^[0-9]{3}-[0-9]{3}-[0-9]{4}";
        pattern = Pattern.compile(Pattern3);
        matcher = pattern.matcher(phone);
        System.out.println("Telephone:" + phone);
        if (matcher.matches()) {
            System.out.println("Valid.");
        } else {
            System.out.println("A valid phone number should contain 10 digits.");
        }

        // case 4
        String email = "tianjiuguo@gmail.com";
        String Pattern4 = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+.[a-zA-Z]{3}";
        pattern = Pattern.compile(Pattern4);
        matcher = pattern.matcher(email);
        System.out.println("Email:" + email);
        if (matcher.matches()) {
            System.out.println("Valid.");
        } else {
            System.out.println("Invalid Email address.");
        }

        // case 5
        String order = "56.23";
        String Pattern5 = "^[0-9]\\d.[0-9]{2}";
        pattern = Pattern.compile(Pattern5);
        matcher = pattern.matcher(order);
        System.out.println("Order amount:" + order);
        if (matcher.matches()) {
            System.out.println("Valid.");
        } else {
            System.out.println("A valid order amount should contain a '.'.");
        }

    }
}