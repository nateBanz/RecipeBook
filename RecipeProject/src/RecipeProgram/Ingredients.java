package RecipeProgram;

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

    public Ingredients(String type, double amount, String measure) {
        this.type = type;
        this.amount = amount;
        this.measure = measure;
    }


    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String x) {
        Ingredients.add(x);
    }


    public int locateIngredients(String In) {
        int i = Ingredients.indexOf(In);
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
        return getIngredients().get(i);
    }


    public String toString() {
        return "Of the " + getFamily() + " family, you need " + getType() + ". You need " + getAmount() + " " + getMeasure() + ".";
    }
}