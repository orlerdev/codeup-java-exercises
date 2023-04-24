import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture{
    public static void main(String[] args){
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)){
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Files.notExists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuf Oreos");

        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(dataFile, moreGroceries, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            for(int i = 1; i <= groceryListFromFile.size(); i += 1){
                System.out.println(i + ": " + groceryListFromFile.get(i - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for(String line : lines){
                if (line.equalsIgnoreCase("Powdered Sugar")){
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!hasPowderedSugar)
            try {
                List<String> addPowderedSugar = Arrays.asList("Powdered Sugar");
                Files.write(dataFile, addPowderedSugar, StandardOpenOption.APPEND);

            } catch (
                    IOException e) {
                e.printStackTrace();
            }

        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for (String line : lines) {
                if (line.equalsIgnoreCase("Double Stuf Oreos")) {
                    newList.add("Regular Oreos");
                } else {
                    newList.add(line);
                }
            }
            Files.write(dataFile, newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
