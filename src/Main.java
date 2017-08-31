import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String stringIn;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter string:\n");
        stringIn = reader.nextLine();
        if (stringIn.length() > 1) {
            String[] wordsArr = stringIn.split(" ");
            stringIn = "";
            for (String s : wordsArr
                    ) {
                String tempString = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    tempString = tempString + s.charAt(i);
                }
                stringIn = stringIn + tempString + " ";
            }
        }
        System.out.println(stringIn);
    }
}
