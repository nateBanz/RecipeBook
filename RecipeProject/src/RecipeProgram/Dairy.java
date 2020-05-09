package RecipeProgram;

public class Dairy extends Ingredients {
    private String family = "Dairy";
    private String type;
    private double amount;
    private String measure;


    public Dairy(String type, double amount, String measure){
        super(type,amount,measure);
    }

    public String getFamily() {
        return family;
    }


}
