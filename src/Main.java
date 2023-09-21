import count.CountSymptom;
import count.ICountSymptom;
import read.ISymptomReader;
import read.ReadSymptomDataFromFile;
import sort.ISortSymptomByName;
import sort.SortSymptomByName;
import write.IWriteSymptomDataToFile;
import write.WriteSymtomDataToFile;

public class Main {
    public static void main(String[] args) throws Exception {
        ISymptomReader reader = new ReadSymptomDataFromFile("src/symptoms.txt");
        ICountSymptom counter = new CountSymptom();
        ISortSymptomByName sorter = new SortSymptomByName();
        IWriteSymptomDataToFile writer = new WriteSymtomDataToFile("result.out");

        AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, counter, sorter, writer);
        analyticsCounter.execute();
    }
}
