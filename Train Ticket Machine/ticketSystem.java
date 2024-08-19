
public class TicketSystem {
    public static double getCharge(Location place,
    boolean isAdult, int numTickets) {
        double basicCharge = 0.0, totalCharge = 0.0;
        switch(place) {
            case SUNNYCITY:
                basicCharge = 2.3;
                break;
            case HAPPYTOWN:
                basicCharge = 2.7;
                break;
            case GLORIOUSLAKE:
                basicCharge = 3.4;
                break;
        }
        if(!isAdult) {
            basicCharge *= 0.9;
        }
        totalCharge = basicCharge * numTickets;
    }
}
