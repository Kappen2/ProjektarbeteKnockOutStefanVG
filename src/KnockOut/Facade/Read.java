package KnockOut.Facade;

import java.io.*;
import java.nio.file.Files;

public class Read {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("Dice results.txt")));

    public Read() throws FileNotFoundException {
    }

    public ArrayList<String> resultListFromFile() throws IOException {
        ArrayList<String> resultList = new ArrayList<>();
        try {
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null) {
                resultList.add(nextLine);
            }
        } catch (Exception ex) {
            System.out.println("Något gick fel!");
        }
    }
}
