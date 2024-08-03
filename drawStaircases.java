public class drawStaircases {
    public static void main(String[] args) {

        int numSteps = 7;
        int stepWidth = 3;
        for (int i = 0; i < numSteps; i++) {

            for (int j=0; j<(i+1) * stepWidth; j++) {

                System.out.println("*");

            }
            
            //change row
            System.out.println();

        }
    }
}
