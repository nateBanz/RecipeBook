import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients {
private ArrayList<String> Ingredients = new ArrayList<>();

    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String x){
        Ingredients.add(x);
    }


    public int locateIngredients(String In){
        int i = Ingredients.indexOf(In);
        return i;

    }



    public String getIngredientsAtLocation(int i){
        return  getIngredients().get(i);
    }

}