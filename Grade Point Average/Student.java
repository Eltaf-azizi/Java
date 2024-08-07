
import java.util.ArrayList;


public class Student {

    public Student(String andy) {
    }

    private String name;
    private ArrayList<String> subject;
    private ArrayList<Character> grade;

    public void Student(String n) {
        name = n;
        subject = new ArrayList<String>();
        grade = new ArrayList<Character>();
    }

    public String getName() {
        return name;
    }

    public void add(String s, Character g) {
        subject.add(s);
        grade.add(g);
    }

    public ArrayList<String> getSubjects() {
        return subject;
    }

    public double getGPA() {
        double totalPoint = 0.0;
        for (char g : grade) {
            switch(g) {
                
                case 'A' :
                totalPoint += 4.0;
                break;

                case 'B':
                totalPoint += 3.0;
                break;

                case 'C':
                totalPoint += 2.0;
                break;

                case 'D':
                totalPoint += 1.0;
                break;

                case 'E':
                totalPoint += 0.0;
                break;
                
            }
        }
        return totalPoint;
    }
}
