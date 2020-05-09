package RecipeProgram;
/**Class: Condiments
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  Constructor for condiments family of ingredients.
 */
public class Condiments extends Ingredients {
    private String family = "Condiments";
    private String type = "sugar";
    private double amount = 1;
    private String measurement;


    public Condiments(String type, double amount, String measurement){
    super(type, amount, measurement);

    }
    public String getFamily() {
        return family;
    }

}
