package RecipeProgram;

/*
Version 2.0: This version includes inheritance. All you need is to add exceptions and a few more ingredients.
 */

import java.util.Scanner;



public class Read {
    private Scanner sc;

    public void directUser(){
        Recipes rec1 = new Recipes();
        rec1.setRecipes("Banana Fritters");


        Ingredients ingredients1 = new Condiments("Sugar", 1, "cup");
        Ingredients ingredients2 = new Protein("eggs", 3);
        Ingredients ingredients3 = new Dairy("Whole Milk", 1 , "cup");
        Recipes Directions1 = new Directions();
        Directions1.setRecipes("In a bowl, beat eggs, milk and oil. Combine flour, baking powder and salt; stir into egg mixture until smooth. Cut bananas into quarters (about 2 in. long). Dip each banana piece into batter to coat.\n" +
                "In an electric skillet or deep-fat fryer, heat oil to 375°. Fry banana pieces, two to three at a time, until golden brown.\n" +
                "Drain on paper towels. Dust with confectioners' sugar if desired.");

        System.out.println("Please enter the name of the recipe you want to see");
        sc = new Scanner(System.in);
        String rec = sc.nextLine();

        int locationRec =rec1.locateRecipe(rec);

        System.out.println("The recipe for " + rec1.getIRecipesAtLocation(locationRec) + " is:\n\n" +ingredients1.toString() + "\n"  + ingredients2.toString() + "\n" +ingredients3.toString() + "\n" + "\n\n" + Directions1.getIRecipesAtLocation(0));

    }

}
