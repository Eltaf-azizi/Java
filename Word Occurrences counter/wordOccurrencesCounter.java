package Word Occurrences counter;
import java.util.Scanner;
import javax.swing.text.AbstractDocument.Content;

public class wordOccurrencesCounter {
    public static void main(String[] args) {

        System.out.println("Enter your passage");
        Scanner scan = new Scanner(System.in);
        String content = scan.nextLine();
        scan.close();
        Content myContent = new Content(content);
        String word = "The";
        System.out.println(word + ": " 
        + myContent.getCount(word));

    }
 }
