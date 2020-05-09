package RecipeProgram;

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
