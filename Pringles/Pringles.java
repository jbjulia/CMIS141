package discussions.cmis141.pringles;

/**
 * @author jbjulia
 */
public class Pringles {

    private final int QUANTITY;

    public Pringles(int quantity) {
        this.QUANTITY = quantity;
    }

    public int getQuantity() {
        return QUANTITY;
    }

    @Override
    public String toString() {
        String output = "\nThere are " + getQuantity() + " Pringles in the can.";
        return output;
    }
}
