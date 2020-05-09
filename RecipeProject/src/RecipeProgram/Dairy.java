package RecipeProgram;
/**Class: Dairy
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  Constructor for Dairy family of ingredients. Takes all the methods of ingredient class
 */
public class Dairy extends Ingredients {
    private String family = "Dairy";
    private String type;
    private double amount;
    private String measure;


    public Dairy(String type, double amount, String measure){
        super(type , amount , measure);
    }

    public String getFamily() {
        return family;
    }


}
