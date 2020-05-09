package RecipeProgram;
/**Class: Directions
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  This class stores Recipes in an array and gives the ability to locate them.
 */
import java.util.ArrayList;
public class Recipes {
    private ArrayList<String> Recipes = new ArrayList<>();
    private String name;



    public String getName(){
        return name;
    }

    /**method:setRecipes allows the user to set a recipe string. Throws a specific exception when the input happens to be blank
     *
     * @param r
     * @throws NumberFormatException
     */
    public void setRecipes(String r) throws NumberFormatException {
        //r.getClass().equals(lookingfor.class)
        //this does nothing cause it causes an error not to have the same type in the code contained in Read.java
       if(! (r instanceof String))
           throw new NumberFormatException("You have to give me some text, nothing else!");
       else
        Recipes.add( r );
    }

    /**Method: locateRecipe finds the recipe in an array. If its not found, throw as specific message.
     *
     * @param rec
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public int locateRecipe(String rec) throws ArrayIndexOutOfBoundsException{
        int i = Recipes.indexOf(rec);
        if(i == -1)
            throw new ArrayIndexOutOfBoundsException("This recipe does not exist, try another one");
        else
            return i;

    }

    /**
     *
     * @return
     */
    public ArrayList<String> getRecipes() {
        return Recipes;
    }

    /**
     *
     * @param i
     * @return
     */
    public String getIRecipesAtLocation(int i){
        return  getRecipes().get( i );
    }

}
