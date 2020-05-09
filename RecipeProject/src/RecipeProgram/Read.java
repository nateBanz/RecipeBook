package RecipeProgram;
/**Class: Read
 * @author Nathaniel Bannis
 * @version 4.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 * This class reads the input given by the user. It finds the recipe you input, locates the directions (same index position in a different array), and outputs these directions and ingredients. Version 3.5 allows the user to get nutrition info from a text file.
 */
import java.util.Scanner;



public class Read extends CookBook {
    private Scanner sc;

    /**
     * Method: directUser()
     * reads user input as well as all ingredients needed.
     * try and catch block: throws exception when the user inputs a recipe that doesnt exist in the cookbook.
     * Reads until you tell it to stop
     * may need to be broken up into multiple methods
     */
    public void directUser() {

        //Initiate a new recipe object to set a recipe


        rec1.setRecipes("Banana Fritters");

        //Add ingredients to set recipe


        //Add directions to a new direction object with the same index location
        Recipes Directions1 = new Directions();
        Directions1.setRecipes("In a bowl, beat eggs, milk and oil. Combine flour, baking powder and salt; stir into egg mixture until smooth. Cut bananas into quarters (about 2 in. long). Dip each banana piece into batter to coat.\n" +
                "In an electric skillet or deep-fat fryer, heat oil to 375°. Fry banana pieces, two to three at a time, until golden brown.\n" +
                "Drain on paper towels. Dust with confectioners' sugar if desired.");

        //Get the recipe. Will throw exception here if not found
        while (true) {
            System.out.println("Please enter the name of the recipe you want to see. If you're done, enter X");
            sc = new Scanner(System.in);

            String rec = sc.nextLine();
            if (rec.toLowerCase().equals("x"))
                break;

            else {
                try {

                    //Find the index location of the recipe
                    int locationRec = rec1.locateRecipe(rec);

                    //prints out the message telling the ingredients, directions and recipe. toString method describes the ingredients.
                    //maybe a polymorphic array here... this might be best
                    System.out.println("The recipe for " + rec1.getIRecipesAtLocation(locationRec) + " is:\n\n" + ingredients1.toString() + "\n" + ingredients2.toString() + "\n" + ingredients3.toString() + "\n" + "\n\n");

                    //slows this section down
                    Thread.sleep(3000);

                    System.out.println(Directions1.getIRecipesAtLocation(0));

                    //reads the nutrition information from a text file in this code block
                    System.out.println("\nDo you want to know the nutrition information? Y/N?");


                    String answer = sc.next();

                    if (answer.toLowerCase().equals("y")) {
                        //slows this section down
                        Thread.sleep(3000);
                        //if this is wrong, the exception will be thrown and it will display the error message
                        System.out.println(obj.readFile("src/Fritter"));
                    }


                }
                //Catches any exceptions found in the try block of code including the additional one if the file ends up missing
                catch (ArrayIndexOutOfBoundsException | NumberFormatException | FileMissing | InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }


        }
    }

}
