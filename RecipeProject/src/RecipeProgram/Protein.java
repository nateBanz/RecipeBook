package RecipeProgram;
/**Class: Protein
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  Constructor for protein family of ingredients. Takes all the methods of ingredient class. Overrides the super.toString().
 */
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
