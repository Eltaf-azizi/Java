
import java.util.ArrayList;


public class Game {
    private ArrayList<Question> questionSet;

    public Game() {
        questionSet = new ArrayList<Question>();
        String q = "Where does the sun rize?";
        String[] a = {"East", "South", "West", "North"};
        questionSet.add(new Question(q, a, "East"));
    }
}
