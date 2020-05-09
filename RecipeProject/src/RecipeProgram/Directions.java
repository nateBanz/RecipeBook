package RecipeProgram;
/**Class: Directions
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 *  This class stores directions in an array and gives the ability to locate them. Extends the recipes class and overrides most of the functions.
 */

import java.util.ArrayList;
public class Directions extends Recipes {
    private ArrayList<String> directions = new ArrayList<>();

    /**
     *
     * @param d
     */
    @Override
    public void setRecipes(String d) {
        directions.add( d );
    }

    public ArrayList<String> getRecipes() {
        return directions;
    }

    /**
     *
     * @param i
     * @return
     */
    public String getIRecipesAtLocation(int i) {
        return getRecipes().get( i );
    }


    public int locateRecipe(String rec) {
        int i = directions.indexOf( rec );
        return i;

    }
}
