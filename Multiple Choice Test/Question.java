
import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public Question(String question, String[] choices, String aswer) {
        this.question = question;
        this.choices = new ArrayList<String>();
        for(int i=0;i<choices.length;i++) {
            this.choices.add(choices[i]);
        }
        // make sure each shows questions in defferent order
        Collections.shuffle(this.choices);
    }

    public String getQuestion(){
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }
}
