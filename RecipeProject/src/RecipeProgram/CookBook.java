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
    public static void main(String[] args) {

        Read first = new Read();
        first.directUser();
    }


}
