package RecipeProgram;
/**Class: Ingredients
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  Creates an array of ingredients(Not used yet, holds param of type, amount and the measurement used along with the family of ingredient
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients {
    private String family;
    private String type;
    private double amount;
    private String measure;
    private ArrayList<String> Ingredients = new ArrayList<>();

    public Ingredients(){

    }
    public Ingredients(String Type) {
        this.type = type;
    }

    public Ingredients(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    /**Method: Ingredients constructs an ingredients object with param.
     *
     * @param type
     * @param amount
     * @param measure
     */
    public Ingredients(String type, double amount, String measure) {
        this.type = type;
        this.amount = amount;
        this.measure = measure;
    }


    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String x) {
        Ingredients.add( x ) ;
    }

    //Hasnt been used yet!
    public int locateIngredients(String In) {
        int i = Ingredients.indexOf( In );
        return i;

    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getMeasure() {
        return measure;
    }
    //public void setType(String type){
    // this.type = type;

    //}

    //public void setAmount(double amount){
    //  this.amount = amount;
    //  }

    public String getFamily() {
        return family;
    }

    public String getIngredientsAtLocation(int i) {
        return getIngredients().get( i );
    }


    public String toString() {
        return "Of the " + getFamily() + " family, you need " + getType() + ". You need " + getAmount() + " " + getMeasure() + ".";
    }
}
