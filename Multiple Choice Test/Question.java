
import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public Question(String question, String[] choices, String aswer) {
        this.question = question;
        this.choices = new ArrayList<String>();
    }
}
