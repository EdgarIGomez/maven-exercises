import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("StringUtils.isNumeric(\"Hello\") = " + StringUtils.isNumeric(input));
        System.out.println("StringUtils.reverse(\"Edgar\") = " + StringUtils.reverse(input));
        System.out.println("StringUtils.swapCase(\"CodeUp\") = " + StringUtils.swapCase(input));

    }
}
