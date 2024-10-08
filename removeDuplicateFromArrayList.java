import java.util.ArrayList;

public class removeDuplicateFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Amy");
        name.add("Tom");
        name.add("Amy");
        name.add("Billy");
        name.add("Tom");
        name.add("Robert");
        name.add("Amy");
        name.add("Robert");
        name.add("Robert");
        System.out.println("Names before checking for duplicates: ");

        for(String str : name) {
            System.out.println(str + " ");
        }

        System.out.println();
        int current = 0;

        while(current < name.size()) {
            int j = 0;
            boolean isRemoved = false;

            while(j < current) {
                if(name.get(current).equals(name.get(j))) {
                    name.remove(current);
                    isRemoved = true;
                    break;
                }

                else j++;
            }

            if(!isRemoved) current++;
        }

        System.out.println("Names after checking for duplicates: ");
        for(String str : name) {
            System.out.println(str + " ");
        }
        
    }

}
