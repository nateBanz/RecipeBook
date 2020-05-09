package RecipeProgram;
/**Class: CookBook
 * @author Nathaniel Bannis
 * @version 3.0
 * Course: ITEC 2050 Spring 2020
 * Written: February 21, 2020
 *
 * This class creates the first read object and outputs ingredients and directions to the recipe of your choosing(only "Banana Fritters" for now.
 */


public class CookBook {
    Recipes rec1 = new Recipes();
    WriteRead obj = new WriteRead();

    //Add ingredients to set recipe
    Ingredients ingredients1 = new Condiments("Sugar", 1, "cup");
    Ingredients ingredients2 = new Protein("eggs", 3);
    Ingredients ingredients3 = new Dairy("Whole Milk", 1, "cup");


    public static void main(String[] args) {

        Read first = new Read();
        first.directUser();

    }


}
