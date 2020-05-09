import java.util.Scanner;

public class Read {
    private Scanner sc;

    public void directUser(){
        Recipes rec1 = new Recipes("Banana Fritters");
        Ingredients ingredients1 = new Ingredients();
        rec1.setRecipes("Banana Fritters");
        ingredients1.setIngredients("4 large super ripe bananas or 1 ½ cup mashed bananas\n" +
                "3/4 cup Whole Wheat flour\n" +
                "3/4-1 cup All purpose flour\n" +
                "2 teaspoon baking powder\n" +
                "2-4 tablespoons brown sugar\n" +
                "1 teaspoon nutmeg\n" +
                "½ teaspoon vanilla\n" +
                "Oil for deep frying\n" +
                "Confection sugar (optional)\n" +
                "1 /2 teaspoon salt or more adjust to taste");


        System.out.println("Please enter the name of the recipe you want to see");
        sc = new Scanner(System.in);
        String rec = sc.nextLine();

        int locationRec =rec1.locateRecipe(rec);

        System.out.println("The recipe for " + rec1.getIRecipesAtLocation(locationRec) + " is:\n\n" +ingredients1.getIngredientsAtLocation(locationRec));

    }
}
