package RecipeProgram;

public class Protein extends Ingredients {
    private String family = "Protein";
    private String type ;
    private String amount;

    public Protein(String type, double amount){

      super(type, amount);
    }

    public String toString() {
        return "Of the  " + getFamily() + " family, you need " + getType() + ".You need " + getAmount() + ".";
    }
    public String getFamily() {
        return family;
    }

}
