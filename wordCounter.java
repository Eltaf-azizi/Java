import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {

        System.out.println("Type your paragraph: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        scan.close();
        userInput = userInput.trim();
        int count = 0;
        if(userInput.length() == 0) {
            count = 0;
        }
        else {
            // count the first word
            // it must exist because the first character
            // must not be a space
            count++;

            for (int i=0; i<userInput.length(); i++) {

                if(userInput.charAt(i) == ' '
                && userInput.charAt(i + 1) != ' '){
                    count++;
                }
            }

        }
        System.out.println("Word count: " + count);

    }    
}
