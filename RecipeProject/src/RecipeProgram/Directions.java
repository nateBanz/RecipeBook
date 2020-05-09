package RecipeProgram;
import java.util.ArrayList;
public class Directions extends Recipes {
    private ArrayList<String> directions = new ArrayList<>();


    @Override
    public void setRecipes(String d) {
        directions.add(d);
    }

    public ArrayList<String> getRecipes() {
        return directions;
    }

    public String getIRecipesAtLocation(int i) {
        return getRecipes().get(i);
    }

    public int locateRecipe(String rec) {
        int i = directions.indexOf(rec);
        return i;

    }
}
