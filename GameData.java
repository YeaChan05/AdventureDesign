import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class GameData {
    private String filepath;
    public GameData(String filepath){
        this.filepath = filepath;
    }

    public void writeCSV() throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(filepath));
        String[] entries = "EW#City#State".split("#");  // 1
        writer.writeNext(entries);

        String[] entries1 = {"W", "Youngstown", "OH"};  // 2
        writer.writeNext(entries1);

        String[] entries2 = {"W", "Williamson", "WV"};
        writer.writeNext(entries2);

        writer.close();
    }

    public void readCSV() throws IOException, CsvValidationException{
        CSVReader reader = new CSVReader(new FileReader(filepath)); // 1
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {   // 2
            for (int i = 0; i < nextLine.length; i++) {
                System.out.println(nextLine[i]);
            }
            System.out.println();
        }
    }
}
