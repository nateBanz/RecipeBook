import java.util.ArrayList;
public class Recipes {
    private ArrayList<String> Recipes = new ArrayList<>();
    private String name;


    public Recipes(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }
    public void setRecipes(String r) {
       Recipes.add(r);
    }

    public int locateRecipe(String rec){
        int i = Recipes.indexOf(rec);
        return i;

    }

    public ArrayList<String> getRecipes() {
        return Recipes;
    }

    public String getIRecipesAtLocation(int i){
        return  getRecipes().get(i);
    }

}
