package RecipeProgram;

/**Class: FillMissing
 * @author Nathaniel Bannis
 * @version 1.0
 * Course: ITEC 2050 Spring 2020
 * Written: April,21 2020
 *
 * Custom file not found exception
 */

    /**
    * Default Constructor
    *
    */
public class FileMissing extends java.io.FileNotFoundException {
    String message;

    public FileMissing(){
        super();
    }


    /**
     * Constructor
     * @param warning
     */
    public FileMissing(String warning){
        super("File Missing" + warning);
        this.message = warning;
    }

        /**
         * Overrides getmessage() from FileNotFoundException
         * @return message
         */
    @Override
    public String getMessage(){
        return message;
    }
}
