
import javax.swing.event.ListSelectionEvent;



public class compareStudentMarks {
    public static void main(String[] a){
        student helen = new student("Helen");
        helen.addMarks("English", 73);
        helen.addMarks("Math", 98);
        helen.addMarks("History", 79);
        student leslie = new student("Leslie");
        leslie.addMarks("English", 89);
        leslie.addMarks("Math", 97);
        leslie.addMarks("History", 92);
        if(helen.compareTo(leslie) > 0) {

            System.out.println(helen.getName()+
            " gets a higher total mark");

        }
        else if(helen.compareTo(leslie) < 0) {
            System.out.println(leslie.getName() + 
            " gets a highrt total mark");
        }
        else {
            System.out.println("Both students get the same total mark");
        }
    }


}
