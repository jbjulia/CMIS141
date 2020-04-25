package discussions.cmis141.pringles;

/**
 * @author jbjulia
 */
public class BBQ extends Pringles {

    private String flavour = "";
    private int amountConsumed = 0;
    private int amountLeft = 0;
    private int numChips = 0;

    public BBQ(int quantity, int amountConsumed) {
        super(quantity);
        flavour = "BBQ";
        this.amountConsumed = amountConsumed;
    }

    public int getAmountLeft() {
        amountLeft = getNumChips() - getAmountConsumed();
        return amountLeft;
    }

    public int getNumChips() {
        numChips = super.getQuantity();
        return numChips;
    }

    public String getFlavour() {
        return flavour;
    }

    public int getAmountConsumed() {
        return amountConsumed;
    }

    @Override
    public String toString() {
        String text = super.toString() + " The flavour of these Pringles are "
                + getFlavour() + ". You have eaten " + getAmountConsumed()
                + ", slow down! There are only " + getAmountLeft() + " left!";
        return text;
    }
}
