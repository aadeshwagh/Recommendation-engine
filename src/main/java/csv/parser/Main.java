package csv.parser;

import csv.parser.load.CSVLoader;
import csv.parser.load.CSVLoaderImp;
import csv.parser.read.CSVReader;
import csv.parser.read.CSVReaderImp;
import csv.parser.write.CSVWrite;
import csv.parser.write.CSVWriteOperations;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static CSVLoader csvLoader;
    public static void main(String[] args) {
        CSVLoader loader = new CSVLoaderImp();
        CSVSchema csvSchema = loader.LoadCSV("google_review_ratings.csv");
        CSVReader csv = new CSVReaderImp(csvSchema);
        CSVWrite writer = new CSVWrite(csvSchema,"google_review_ratings.csv");
        Map<String ,Object> map = new HashMap<>();
        map.put("User","User 6988");
        map.put("Category 2","3.9");
        writer.updateRow(1,map);


    }



}
