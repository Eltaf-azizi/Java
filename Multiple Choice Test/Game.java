
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Game {
    private ArrayList<Question> questionSet;

    public Game() {
        questionSet = new ArrayList<Question>();
        String q = "Where does the sun rise?";
        String[] a = {"East", "South", "West", "North"};
        questionSet.add(new Question(q, a, "East"));
        q = "Who invented the telephone?";
        // must reuse variable with new String[]
        // array constants can only be used during initialization
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt",
            "Alexander Bell"};       
        
        questionSet.add(new Question(q, a "Alexander Bell"));
        q = "Where is the capital of Japan?";
        a = new String[]{"Beijing", "Tokyo", "Seoul", "Bankok"};
        questionSet.add(new Question(q, a, "Tokyo"));
        Collections.shuffle(questionSet, new Random());
    }
    public void start() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        //show questions from questionSet
        for(int question =0;question<questionSet.size();question++) {
            System.out.println(questionSet.get(question).getQuestion());
        }
    }
}
