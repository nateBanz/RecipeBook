package RecipeProgram;
/**Class: Read
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 * This class reads the input given by the user. It finds the recipe you input, locates the directions (same index position in a different array), and outputs these directions and ingredients
 */
import java.util.Scanner;



public class Read {
    private Scanner sc;

    /** Method: directUser()
     * sets the recipe and directions as well as all ingredients needed.
     * try and catch block: throws exception when the user inputs a recipe that doesnt exist in the cookbook.
     */
    public void directUser(){
        try {
            //Initiate a new recipe object to set a recipe
            Recipes rec1 = new Recipes();
            rec1.setRecipes("Banana Fritters");

            //Add ingredients to set recipe
            Ingredients ingredients1 = new Condiments("Sugar", 1, "cup");
            Ingredients ingredients2 = new Protein("eggs", 3);
            Ingredients ingredients3 = new Dairy("Whole Milk", 1, "cup");

            //Add directions to a new direction object with the same index location
            Recipes Directions1 = new Directions();
            Directions1.setRecipes("In a bowl, beat eggs, milk and oil. Combine flour, baking powder and salt; stir into egg mixture until smooth. Cut bananas into quarters (about 2 in. long). Dip each banana piece into batter to coat.\n" +
                    "In an electric skillet or deep-fat fryer, heat oil to 375°. Fry banana pieces, two to three at a time, until golden brown.\n" +
                    "Drain on paper towels. Dust with confectioners' sugar if desired.");

            //Get the recipe. Will throw exception here if not found
            System.out.println("Please enter the name of the recipe you want to see");
            sc = new Scanner(System.in);
            String rec = sc.nextLine();

            //Find the index location of the recipe
            int locationRec = rec1.locateRecipe( rec );

            //prints out the message telling the ingredients, directions and recipe. toString method describes the ingredients.
            //maybe a polymorphic array here... or encapsulate everything in another toString()?
            System.out.println("The recipe for " + rec1.getIRecipesAtLocation(locationRec) + " is:\n\n" + ingredients1.toString() + "\n" + ingredients2.toString() + "\n" + ingredients3.toString() + "\n" + "\n\n" + Directions1.getIRecipesAtLocation(0));
        }

        //Catches any exceptions found in the try block of code
        catch (ArrayIndexOutOfBoundsException | NumberFormatException ex){
            System.out.println("This recipe doesnt exist, try another one!");
        }
    }

}
