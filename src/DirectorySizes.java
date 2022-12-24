import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectorySizes {

    public static void main(String[] args){

        //Read in from input text file
        List<String> inputStringsList = new ArrayList<>();
        int inputIndex = 0;
        try {
            Scanner inputReader = new Scanner(new File("inputDay7ShortShort.txt"));

            while(inputReader.hasNextLine()){
                inputStringsList.add(inputReader.nextLine());
                inputIndex++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Call method to parse out each line

        //Check List of Strings read in from text file
        System.out.println("Check List of Strings read in from text file.");
        for(int i = 0; i < inputStringsList.size(); i++){
            System.out.println("Line " + i + ": " + inputStringsList.get(i));
        }

    }
}
