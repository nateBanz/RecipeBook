package RecipeProgram;
/**Class: WriteRead
 * @author Nathaniel Bannis
 * @version 1.0
 * Course: ITEC 2050 Spring 2020
 * Written: April 21, 2020
 *
 * Allows the user to read data from a file. Writing is available but not used in this program
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WriteRead  {

    /**
     * @param name
     * @return ArrayList
     * @throws FileMissing
     */
    public ArrayList<String> readFile(String name) throws FileMissing {
        ArrayList<String> info = new ArrayList<>();

        try{
            File file = new File(name);
            Scanner content = new Scanner(file);
            while(content.hasNextLine()){
                info.add(content.nextLine());
            }
        }
        catch(FileNotFoundException ex){
            throw new FileMissing( "The file " +name+" doesnt exist. Please check your spelling or provide a different file name");
        }

        return info;


    }

    /**
     * @param outputFileName
     * @param lines
     * @throws FileMissing
     */
    /*
    Can be used to make add new nutrition info to the file. Not really used here but could potentially be used once the code is updated to allow users to import their own recipes and nutrition info. Probably best to use a database
     */
    public void writeFile(String outputFileName, ArrayList<String> lines) throws FileMissing {
        try(java.io.PrintWriter out = new java.io.PrintWriter(outputFileName)){
            for(int i = 0; i<lines.size()-1; i++){
                out.println(lines.get(i));
            }
        }
        catch(FileNotFoundException e){
            throw new FileMissing(outputFileName + " was not found.");
        }
    }


}
